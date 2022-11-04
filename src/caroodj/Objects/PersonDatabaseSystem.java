package Objects;

import java.util.Scanner;

public class PersonDatabaseSystem extends DatabaseSystem {
    PersonDatabaseSystem(String path) {
        super(path);
    }

    public static String constructEntry(Person person) {
        String entry = person.getId() + ";" + person.username + ";" + person.type + ";" + person.getEmail() + ";" + person.getName() + ";" + person.getPassword();
        return entry;
    }

    public static Person deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String username = attributes[1];
        String type = attributes[2];
        String email = attributes[3];
        String name = attributes[4];
        String password = attributes[5];

        Person person = new Person(username, password);
        person.setEmail(email);
        person.setId(attributes[0]);
        person.type = type;
        person.setName(name);
        return person;
    }

    public boolean checkDuplicate(String username) {
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Person person = deconstructEntry(data);
            if (username.equals(person.username)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPassword(String username, String password) {
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Person person = deconstructEntry(data);
            if (username.equals(person.username)) {
                return password.equals(person.getPassword());
            }
        }
        return false;
    }

    public Person queryByUsername(String username) {
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Person person = deconstructEntry(data);
            if (username.equals(person.username)) {
                return person;
            }
        }
        return null;
    }
}

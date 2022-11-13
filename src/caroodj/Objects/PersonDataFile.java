package Objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonDataFile extends DataFile {
    PersonDataFile(String path) {
        super(path);
    }

    public ArrayList<Person> queryDatabase(HashMap<String, String> query) {
        Scanner dataFile = super.openFileRead();

        ArrayList<Person> personIdList = new ArrayList<Person>();
        ArrayList<Person> arrayPersonId = new ArrayList<Person>();

        String id = query.get("Id");
        String type = query.get("Type");
        String password = query.get("Password");
        String username = query.get("Username");
        String email = query.get("Email");
        String name = query.get("Name");
        
        String dateOfBirth = query.get("DOB");

        String[] featureVal = {id, type, password, dateOfBirth ,username, email, name};

        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Person person = deconstructEntry(data);
            if (!super.isStar(id)) {
                if (person.getId().equals(id)) {
                    personIdList.add(person);
                }
            } else {
                personIdList.add(person);
            }
        }

        for (Integer i = 1; i < featureVal.length; i++) {
            if (!super.isStar(featureVal[i])) {
                for (Person person : personIdList) {
                    if (i == 1) {
                        if (person.type.equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    } else if (i == 2) {
                        if (person.getPassword().equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    } else if (i == 3) {
                        if (person.getDateOfBirth().equals(LocalDate.parse(featureVal[i]))) {
                            arrayPersonId.add(person);
                        }
                    } else if (i == 4) {
                        if (person.username.equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    } else if (i == 5) {
                        if (person.getEmail().equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    } else if (i == 6) {
                        if (person.getName().equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    }
                }
                personIdList.clear();
                personIdList = (ArrayList<Person>)arrayPersonId.clone();
                arrayPersonId.clear();
            }
        }

        return personIdList;
    }

    public static HashMap<String, String> createQuery(String id, String username, String type, String email, String name, String dateOfBirth, String password) {
        HashMap<String, String> query = new HashMap<String, String>();

        query.put("Id", id);
        query.put("Type", type);
        query.put("Password", password);
        query.put("Username", username);
        query.put("Email", email);
        query.put("Name", name);
        query.put("DOB", dateOfBirth);

        return query;
    }

    public static String constructEntry(Person person) {
        String entry = person.getId() + ";" + person.username + ";" + person.type + ";" + person.getEmail() + ";" + person.getName() + ";" + person.getDateOfBirth() + ";" + person.getPassword();
        return entry;
    }

    // Fix person abstarcxt class
    public static Person deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String username = attributes[1];
        String type = attributes[2];
        String email = attributes[3];
        String name = attributes[4];

        // Add try catch date
        LocalDate dateOfBirth = LocalDate.parse(attributes[5]);
        String password = attributes[6];

        Person person = new Person(username, password, dateOfBirth);
        person.setEmail(email);
        person.setId(attributes[0]);
        person.type = type;
        person.setName(name);
        person.setDateOfBirth(dateOfBirth);
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
    // Fix person abstract class
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

package Objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonDataFile extends DataFile {
    PersonDataFile(String path) {
        super(path);
    }

    public ArrayList<String[]> queryDatabase(HashMap<String, String> query) {
        Scanner dataFile = super.openFileRead();

        ArrayList<String[]> personIdList = new ArrayList<String[]>();
        ArrayList<String[]> arrayPersonId = new ArrayList<String[]>();

        String id = query.get("Id");
        String type = query.get("Type");
        String password = query.get("Password");
        String username = query.get("Username");
        String email = query.get("Email");
        String name = query.get("Name");
        
        String dateOfBirth = query.get("DOB");

        String[] featureVal = {id, type, password, dateOfBirth, username, email, name};

        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            String[] person = deconstructEntry(data);
            if (!super.isStar(id)) {
                if (person[0].equals(id)) {
                    personIdList.add(person);
                }
            } else {
                personIdList.add(person);
            }
        }

        for (Integer i = 1; i < featureVal.length; i++) {
            if (!super.isStar(featureVal[i])) {
                for (String[] person : personIdList) {
                    if (i == 3) {
                        if (LocalDate.parse(person[3]).equals(LocalDate.parse(featureVal[i]))) {
                            arrayPersonId.add(person);
                        }
                    } else {
                        System.out.println(person[i] + " " + featureVal[i]);
                        if (person[i].equals(featureVal[i])) {
                            arrayPersonId.add(person);
                        }
                    }
                }
                personIdList.clear();
                personIdList = (ArrayList<String[]>)arrayPersonId.clone();
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
    public static String[] deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String id = attributes[0];
        String username = attributes[1];
        String type = attributes[2];
        String email = attributes[3];
        String name = attributes[4];

        // Add try catch date
        String dateOfBirth = attributes[5];
        String password = attributes[6];

        String[] person = {id, type, password, dateOfBirth, username, email, name};
        return person;
    }

    public boolean checkDuplicate(String username) {
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            String[] person = deconstructEntry(data);
            if (username.equals(person[4])) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPassword(String username, String password) {
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            String[] person = deconstructEntry(data);
            if (username.equals(person[4])) {
                return password.equals(person[2]);
            }
        }
        return false;
    }
}

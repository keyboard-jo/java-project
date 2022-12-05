package Objects;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonDataFile extends DataFile<String[]> {
    public PersonDataFile(String path) {
        super(path);
    }

    public DataFileQueryOperator<String[]> queryDatabase(HashMap<String, String> query) {
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
            System.out.println(data);
            String[] person = deconstructEntry(data);
            if (!super.isStar(id)) {
                if (person[0].equals(id)) {
                    personIdList.add(person);
                }
            } else {
                personIdList.add(person);
            }
        }

        dataFile.close();

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

        this.dfqo.setLastQuery(personIdList);
        return this.dfqo;
    }

    public HashMap<String, String> createQuery(String[] person) {
        HashMap<String, String> query = new HashMap<String, String>();

        query.put("Id", person[0]);
        query.put("Type", person[1]);
        query.put("Password", person[2]);
        query.put("DOB", person[3]);
        query.put("Username", person[4]);
        query.put("Email", person[5]);
        query.put("Name", person[6]);

        return query;
    }

    public String constructEntry(String[] person) {
        String entry = person[0] + ";" + person[1] + ";" + person[2] + ";" + person[3] + ";" + person[4] + ";" + person[5] + ";" + person[6];
        return entry;
    }

    // Fix person abstarcxt class
    public String[] deconstructEntry(String entry) {

        String[] attributes = entry.split(";", 7);

        System.out.println(attributes[0]);
        System.out.println(attributes.length);
        String id = attributes[0];
        String type = attributes[1];
        String password = attributes[2];

        // Add try catch date
        String dateOfBirth = attributes[3];

        String username = attributes[4];
        String email = attributes[5];
        String name = attributes[6];


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

    public void removeEntry(String id) throws IOException {
        Scanner dataFileRead = this.openFileRead();

        ArrayList<String> entries = new ArrayList<String>();

        while (dataFileRead.hasNextLine()) {
            String data = dataFileRead.nextLine();
            if (!data.split(";")[0].equals(id)) {
                entries.add(data);
            }
        }

        dataFileRead.close();

        BufferedWriter dataFileWrite = this.openFileWrite();

        for (String entry: entries) {
            dataFileWrite.write(entry + System.lineSeparator());
        }
        dataFileWrite.close();

        entries.clear();

        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        Scanner dataFileReadBooking = bdf.openFileRead();

        while (dataFileReadBooking.hasNextLine()) {
            String data = dataFileReadBooking.nextLine();
            if (!data.split(";")[6].equals(id)) {
                entries.add(data);
            }
        }

        dataFileReadBooking.close();

        BufferedWriter dataFileWriteBooking = bdf.openFileWrite();

        for (String entry: entries) {
            dataFileWriteBooking.write(entry + System.lineSeparator());
        }

        dataFileWriteBooking.close();
    }

    @Override
    public Boolean updateEntry(String[] person) throws IOException {
        Scanner dataFileRead = super.openFileRead();

        ArrayList<String[]> personList = new ArrayList<String[]>();

        Boolean isChanged = false;

        while (dataFileRead.hasNextLine()) {
            String[] personData = deconstructEntry(dataFileRead.nextLine());
            if (person[0].equals(personData[0])) {
                personList.add(person);
                isChanged = true;
            } else {
                personList.add(personData);
            }
        }

        dataFileRead.close();

        BufferedWriter dataFileWrite = super.openFileWrite();
        for (String[] personData: personList) {
            String entry = constructEntry(personData);
            dataFileWrite.write(entry + System.lineSeparator());
        }
        dataFileWrite.close();
        return isChanged;
    }
}

package Objects;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class Client extends Person{
    public Client(String username, String password, LocalDate dateOfBirth) {
        super(username, password, dateOfBirth);
        super.type = "client";
    }

    // Register to the DatabaseSystem
    public Boolean register() {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        // Fixx this to match query
        String[] personData = {super.getId(), this.type, super.getPassword(), super.getDateOfBirth()+"", super.username, super.getEmail(), super.getName()};
        String entry = pdf.constructEntry(personData);
        if (pdf.checkDuplicate(username)) {
            try {
                pdf.addEntry(entry);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        } else {
            return false;
        }
    }


    public static Client convertToClient(String[] params) {
        String id = params[0];
        String type = params[1];

        String password = params[2];
        // Add try catch date
        LocalDate dateOfBirth = LocalDate.parse(params[3]);
        String username = params[4];
        String email = params[5];
        String name = params[6];


        Client client = new Client(username, password, dateOfBirth);
        client.setId(id);
        client.setEmail(email);
        client.setName(name);
        client.type = type;

        return client;
    }

    public Boolean update(HashMap<String, String> updateMap) {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        for (String key : updateMap.keySet()) {
            switch (key) {
                case "Username":
                    if (pdf.checkUsername(this.getId(), updateMap.get(key))) {
                        this.username = updateMap.get(key);
                    } else {
                        return false;
                    }
                    break;
                case "Type":
                    this.type = updateMap.get(key);
                    break;
                case "Name":
                    this.setName(updateMap.get(key));
                    break;
                case "Password":
                    this.setPassword(updateMap.get(key));
                    break;
                case "Email":
                    this.setEmail(updateMap.get(key));
                    break;
                case "DOB":
                    this.setDateOfBirth(LocalDate.parse(updateMap.get(key)));
                    break;
                default:
                    break;
            }
        }


        String[] person = {super.getId(), this.type, this.getPassword(), this.getDateOfBirth()+"", this.username, this.getEmail(), this.getName()};

        try {
            Boolean isChanged = pdf.updateEntry(person);
            return isChanged;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}

package Objects;

import java.time.LocalDate;

public class Client extends Person{
    public Client(String username, String password, LocalDate dateOfBirth) {
        super(username, password, dateOfBirth);
        super.type = "client";
    }

    // Register to the DatabaseSystem
    public boolean register() {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        String[] personData = {super.getId(), this.username, this.type, super.getEmail(), super.getName(), super.getDateOfBirth()+"", super.getPassword()};
        String entry = pdf.constructEntry(personData);
        if (pdf.checkDuplicate(username)) {
            pdf.addEntry(entry);
            return true;
        } else {
            return false;
        }
    }

    public void createCarBooking() {

    }

    public void viewCarBookingHistory() {

    }

    public static Client convertToClient(String[] params) {
        String id = params[0];
        String username = params[1];
        String type = params[2];
        String email = params[3];
        String name = params[4];

        // Add try catch date
        LocalDate dateOfBirth = LocalDate.parse(params[5]);
        String password = params[6];

        Client client = new Client(username, password, dateOfBirth);
        client.setId(id);
        client.setEmail(email);
        client.setName(name);
        client.type = type;

        return client;
    }
}

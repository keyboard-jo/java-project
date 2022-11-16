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
}

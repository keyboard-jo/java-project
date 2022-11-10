package Objects;

import java.time.LocalDate;

public class Client extends Person{
    public Client(String username, String password, LocalDate dateOfBirth) {
        super(username, password, dateOfBirth);
        super.type = "client";
    }

    // Register to the DatabaseSystem
    public boolean register() {
        PersonDatabaseSystem pds = new PersonDatabaseSystem("src\\caroodj\\Data\\Person.txt");
        String entry = PersonDatabaseSystem.constructEntry(this);
        if (pds.checkDuplicate(username)) {
            pds.addEntry(entry);
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

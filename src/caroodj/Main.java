import java.beans.PersistenceDelegate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import Menus.Base;
import Objects.Booking;
import Objects.BookingDataFile;
import Objects.Car;
import Objects.CarDataFile;
import Objects.Client;
import Objects.EntityId;
import Objects.Person;
import Objects.PersonDataFile;

// TODO: Implement try catch in every user form
// TODO: add input validation for forms
// TODO: Fix radioButton in ClientQuery and ManageClientInformation
// TODO: Add dateCreated attribute for Booking

// ASssumption: admin can double book
public class Main {
    public static void main(String[] aStrings){

        // CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        // String [] query = {"*", "*", "*", "*", "*", "*"};
        
        // ArrayList<Car> carList = cdf.queryDatabase(cdf.createQuery(query)).all();

        // BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");

        // PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        // String[] queryCandidate = {"CL:8e1528f4-452b-4c15-b48f-a42da19b504a", "*", "*", "*", "*", "*", "*"};
        // HashMap<String, String> queryPerson = pdf.createQuery(queryCandidate);

        // Client client = Client.convertToClient(pdf.queryDatabase(queryPerson).first());

        // LocalDate startDate = LocalDate.of(2022, 1, 1);
        // LocalDate endDate = LocalDate.of(2022, 1, 3);

        // for (Car car : carList) {
        //     Booking booking = new Booking(startDate, endDate, false, false, car, client);
        //     booking.setId("BO:"+EntityId.generateId());
        //     bdf.addEntry(bdf.constructEntry(booking));
        //     startDate.plusDays(5);
        //     endDate.plusDays(5);
        // }

        new Base().setVisible(true);
    }
}

    // TODO: Create function that can query database system
    // TODO: create try catch date
    // TODO: make person, entityId, and databaseSystem abtract class, fix function that returns person
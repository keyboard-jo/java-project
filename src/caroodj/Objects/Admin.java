package Objects;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Admin
 */
public class Admin extends Person {

    public Admin(String username, String password, LocalDate dateOfBirth) {
        super(username, password, dateOfBirth);
        super.type = "admin";
    }

    // Takes in attributes of a car and create a car object. Sets its ID and add it to the database
    public void addCar(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId("CA:" + EntityId.generateId());
        
        CarDataFile cdbs = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        String carEntry = cdbs.constructEntry(car);

        try {
            cdbs.addEntry(carEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editCar() {

    }

    public void confirmCarBooking() {

    }
}
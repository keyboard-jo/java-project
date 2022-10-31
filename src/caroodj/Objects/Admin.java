package Objects;

import java.time.LocalDate;

/**
 * Admin
 */
public class Admin extends Person {

    public Admin(String username, String password) {
        super(username, password);
        super.type = "admin";
    }

    // Takes in attributes of a car and create a car object. Sets its ID and add it to the database
    public void addCar(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId("CA:" + EntityId.generateId());
        
        CarDatabaseSystem cdbs = new CarDatabaseSystem("src\\caroodj\\Data\\Car.txt");

        String carEntry = CarDatabaseSystem.constructEntry(car);

        cdbs.addEntry(carEntry);
    }

    public void editCar() {

    }

    public void confirmCarBooking() {

    }
}
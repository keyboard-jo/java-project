package Objects;

import java.time.LocalDate;

/**
 * Admin
 */
public class Admin extends Person {

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
        super.type = "admin";
    }

    // Takes in attributes of a car and create a car object. Sets its ID and add it to the database
    public void addCar(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId("CA:" + EntityId.generateId());
        String carEntry = car.getId() + ";" + car.manufacture + ";" + car.model + ";" + car.rentalCost + ";" + car.year + ";" + car.isRented;
        
        CarDatabaseSystem cdbs = new CarDatabaseSystem("./Data/Car.txt");
        cdbs.addEntry(carEntry);
    }

    public void editCar() {

    }

    public void confirmCarBooking() {

    }
}
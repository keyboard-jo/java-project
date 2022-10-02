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

    public void addCar(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId("CA" + EntityId.generateId());
        CarDatabaseSystem cdbs = new CarDatabaseSystem("./Data/Car.txt");
        cdbs.addEntry(car);
    }

    public void editCar() {

    }

    public void confirmCarBooking() {

    }
}
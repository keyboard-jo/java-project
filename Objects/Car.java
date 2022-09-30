package Objects;

import java.util.Date;

public class Car {
    String id;
    String manufacture;
    String model;
    Date year;
    Double rentalCost;
    Boolean isRented;

    public Car(String id, String manufacture, String model, Date year, Double rentalCost, Boolean isRented) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.rentalCost = rentalCost;
        this.isRented = isRented;
    }
}

package Objects;

import java.time.LocalDate;

public class Car extends EntityId{
    String manufacture;
    String model;
    LocalDate year;
    Double rentalCost;
    Boolean isRented;

    public Car(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.rentalCost = rentalCost;
        this.isRented = isRented;
    }
}

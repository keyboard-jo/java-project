package Objects;

import java.time.LocalDate;

public class Car extends EntityId{
    public String manufacture;
    public String model;
    public LocalDate year;
    public Double rentalCost;
    public Boolean isRented;

    public Car(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.rentalCost = rentalCost;
        this.isRented = isRented;
    }
}

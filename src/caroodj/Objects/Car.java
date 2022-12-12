package Objects;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class Car extends EntityId{
    private String manufacture;
    private String model;
    private LocalDate year;
    private Double rentalCost;
    private Boolean isRented;

    public Car(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.rentalCost = rentalCost;
        this.isRented = isRented;
    }

    public Boolean getIsRented() {
        return isRented;
    }
    public String getManufacture() {
        return manufacture;
    }
    public String getModel() {
        return model;
    }
    public Double getRentalCost() {
        return rentalCost;
    }
    public LocalDate getYear() {
        return year;
    }
    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }
    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Boolean update(HashMap<String, String> updateMap) {
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
        for (String key : updateMap.keySet()) {
            switch (key) {
                case "Manufacture":
                    this.manufacture = updateMap.get(key);
                    break;
                case "Model":
                    this.model = updateMap.get(key);
                    break;
                case "Year":
                    this.year = LocalDate.parse(updateMap.get(key));
                    break;
                case "Rent":
                    this.rentalCost = Double.parseDouble(updateMap.get(key));
                    break;
                case "isRented":
                    this.isRented = Boolean.parseBoolean(updateMap.get(key));
                    break;
                default:
                    break;
            }
        }

        try {
            Boolean isChanged = cdf.updateEntry(this);
            return isChanged;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Boolean record() throws IOException {
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
        cdf.addEntry(cdf.constructEntry(this));
        return isRented;
    }
}

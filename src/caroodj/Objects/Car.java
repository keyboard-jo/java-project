package Objects;

import java.time.LocalDate;
import java.util.HashMap;

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
}

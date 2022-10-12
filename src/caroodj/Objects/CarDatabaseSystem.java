package Objects;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarDatabaseSystem extends DatabaseSystem{

    public CarDatabaseSystem(String path) {
        super(path);
    }

    // Query database based on hashmap
    public ArrayList<Car> queryDatabase(HashMap<String, String> query) {
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            System.out.println(data);
        }
        return carList;
    }

    public static String constructEntry(Car car) {
        String entry = car.getId() + ";" + car.manufacture + ";" + car.model + ";" + car.rentalCost + ";" + car.year + ";" + car.isRented;
        return entry;
    }

    public static Car deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String manufacture = attributes[1];
        String model = attributes[2];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");

        LocalDate year = LocalDate.parse(attributes[4], formatter);
        Double rentalCost = Double.parseDouble(attributes[3]);
        Boolean isRented = Boolean.parseBoolean(attributes[5]);
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId(attributes[0]);
        return car;
    }
}

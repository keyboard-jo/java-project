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
    public ArrayList<Car> queryDatabaseOne(HashMap<String, String> query) {
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner dataFile = super.openFileRead();

        String manufacture = query.get("Manufacture");
        String model = query.get("Model");

        Boolean isRented = Boolean.parseBoolean(query.get("Rented"));

        // Add try catch date
        Boolean isRangeDate = query.get("Year").split(" ", 2).length > 1;
        Boolean isRangeDouble = query.get("Rent").split(" ", 2).length > 1;

        if (isRangeDate) {
            String yearsRange[] = query.get("Year").split(" ", 2);
            LocalDate yearLow = LocalDate.parse(yearsRange[0]);
            LocalDate yearHigh = LocalDate.parse(yearsRange[1]);
        } else {
            LocalDate year = LocalDate.parse(query.get("Year"));
        }

        if (isRangeDouble) {
            String rentRange[] = query.get("Rent").split(" ", 2);
            Double rentLow = Double.parseDouble(rentRange[0]);
            Double rentHigh = Double.parseDouble(rentRange[1]);
        } else {
            Double rent = Double.parseDouble(query.get("Rent"));
        }
        

        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Car car = deconstructEntry(data);
            System.out.println(data);
        }
        return carList;
    }

    // Print database content
    public ArrayList<Car> displayDatabase() {
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            carList.add(deconstructEntry(data));
            System.out.println(data);
        }
        return carList;
    }

    public static String constructEntry(Car car) {
        String entry = car.getId() + ";" + car.manufacture + ";" + car.model + ";" + car.year + ";" + car.rentalCost + ";" + car.isRented;
        return entry;
    }

    public static Car deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String manufacture = attributes[1];
        String model = attributes[2];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

        LocalDate year = LocalDate.parse(attributes[3], formatter);
        Double rentalCost = Double.parseDouble(attributes[4]);
        Boolean isRented = Boolean.parseBoolean(attributes[5]);
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId(attributes[0]);
        return car;
    }
}

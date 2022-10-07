package Objects;
import java.io.BufferedWriter;
import java.io.IOException;
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

    // public static Car deconstructEntry(String entry) {
    //     String[] attributes = entry.split(";");

    // }
}

package Objects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarDatabaseSystem extends DatabaseSystem{

    public CarDatabaseSystem(String path) {
        super(path);
    }

    public ArrayList<Car> queryDatabase(HashMap<String, String> query) {
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner dataFile = super.openFileRead();
        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            System.out.println(data);
        }
        return carList;
    }

    public void addEntry(Car car) {
        BufferedWriter dataFile = super.openFileAppend();
        try {
            String entry = car.getId() + ";" + car.manufacture + ";" + car.model + ";" + car.rentalCost + ";" + car.year + ";" + car.isRented;
            dataFile.write(entry + System.lineSeparator());
            dataFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

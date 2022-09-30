package Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarDatabaseSystem extends DatabaseSystem{

    public CarDatabaseSystem(String path) {
        super(path);
    }

    public ArrayList<Car> queryDatabase(HashMap<String, String> query) {
        ArrayList<Car> carList = new ArrayList<Car>();
        Scanner dataFile = openFile();
        return carList;
    }
    
}

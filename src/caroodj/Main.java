import java.util.ArrayList;

import Menus.Base;
import Objects.Car;
import Objects.CarDataFile;

public class Main {
    public static void main(String[] aStrings){

        CarDataFile cdbs = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        String [] query = {"*", "BMW", "*", "*", "*", "*"};
        
        ArrayList<Car> carList = cdbs.queryDatabase(cdbs.createQuery(query)).all();

        for (Car car : carList) {
            System.out.println(car.getId());
        }
        

        // Display all database
        // ArrayList<Car> carList = cdbs.displayDatabase();
        // System.out.println(carList);

        new Base().setVisible(true);
    }
}

    // TODO: Create function that can query database system
    // TODO: create try catch date
    // TODO: make person, entityId, and databaseSystem abtract class, fix function that returns person
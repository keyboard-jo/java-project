import java.util.ArrayList;

import Menus.Base;
import Objects.Car;
import Objects.CarDataFile;

public class Main {
    public static void main(String[] aStrings){

        // Class<?> current = admin.getClass();
        // while (current.getSuperclass() != null) {
        //     Field[] fields = current.getDeclaredFields();
        //     for(int i = 0; i < fields.length; i++) {
        //         System.out.println("Field = " + fields[i].toString());
        //  }
        //     current = current.getSuperclass();
        // }

        // Add car
        // admin.addCar("Honda", "Jazz", LocalDate.of(2022, 1, 1), 84615.45, false);

        CarDataFile cdbs = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        ArrayList<Car> carList = cdbs.queryDatabase(CarDataFile.createQuery("*", "BMW", "*", "*", "*", "*"));

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
import java.util.ArrayList;

import Menus.Base;
import Objects.Car;
import Objects.CarDatabaseSystem;

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

        CarDatabaseSystem cdbs = new CarDatabaseSystem("src\\caroodj\\Data\\Car.txt");

        // Display all database
        ArrayList<Car> carList = cdbs.displayDatabase();
        System.out.println(carList);

        new Base().setVisible(true);
    }
}

    // TODO: Create function that can query database system
    // TODO: Create validation when registering, text field should not be empty
    // TODO: Create mandatory date picker or try catch for fail date parseing
    // TODO: create try catch date
    

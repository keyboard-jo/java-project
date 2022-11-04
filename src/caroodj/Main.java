import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;

import Menus.Base;
import Objects.Admin;
import Objects.Car;
import Objects.CarDatabaseSystem;
import Objects.EntityId;

public class Main {
    public static void main(String[] aStrings){
        
        Admin admin = new Admin("Jonathan", "aiduaiudgabdkanwk");
        admin.setId("AD:" + EntityId.generateId());
        System.out.println(admin.getId());
        admin.sayHello();

        Class<?> current = admin.getClass();
        while (current.getSuperclass() != null) {
            Field[] fields = current.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                System.out.println("Field = " + fields[i].toString());
         }
            current = current.getSuperclass();
        }

        // Add car
        admin.addCar("Honda", "Jazz", LocalDate.of(2022, 1, 1), 84615.45, false);

        CarDatabaseSystem cdbs = new CarDatabaseSystem("src\\caroodj\\Data\\Car.txt");

        // Display all database
        ArrayList<Car> carList = cdbs.displayDatabase();
        System.out.println(carList);

        new Base().setVisible(true);
    }
}

    // TODO: Create function that can query database system
    

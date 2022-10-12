import java.lang.reflect.Field;
import java.time.LocalDate;

import Objects.Admin;
import Objects.DatabaseSystem;
import Objects.EntityId;

public class Main {
    public static void main(String[] aStrings){
        
        Admin admin = new Admin("Jonathan", "Joestar");
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

        admin.addCar("Honda", "Jazz", LocalDate.of(2022, 1, 1), 84615.45, false);

        DatabaseSystem dbs = new DatabaseSystem("./Data/Car.txt");
        dbs.openFileRead();

        new Swing();
    }
}

    // TODO: Create function that can query database system
    

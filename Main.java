import java.time.LocalDate;
import java.util.Date;

import Objects.Admin;
import Objects.DatabaseSystem;
import Objects.EntityId;

public class Main {
    public static void main(String[] aStrings){
        
        Admin admin = new Admin("Jonathan", "Joestar");
        admin.setId("AD:" + EntityId.generateId());
        System.out.println(admin.getId());
        admin.sayHello();
        admin.addCar("Honda", "Jazz", LocalDate.of(2022, 1, 1), 84615.45, false);

        DatabaseSystem dbs = new DatabaseSystem("./Data/Car.txt");
        dbs.openFileRead();
    }
}


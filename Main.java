import Objects.Admin;
import Objects.DatabaseSystem;

public class Main {
    public static void main(String[] aStrings){
        Admin admin = new Admin("Jonathan", "Joestar");
        admin.sayHello();
        DatabaseSystem dbs = new DatabaseSystem("./Data/Car.txt");
        dbs.openFile();
    }
}

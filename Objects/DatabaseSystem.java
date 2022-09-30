package Objects;

public class DatabaseSystem {
    String path;
    public DatabaseSystem(String path) {
        this.path = path;
    }

    public Car[] queryDatabase() {
        Car[] carList = {new Car(path, path, null, null)};
        return carList;
    }
    
}

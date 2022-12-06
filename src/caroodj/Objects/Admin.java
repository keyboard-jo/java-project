package Objects;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

/**
 * Admin
 */
public class Admin extends Person {

    public Admin(String username, String password, LocalDate dateOfBirth) {
        super(username, password, dateOfBirth);
        super.type = "admin";
    }

    public static Admin convertToAdmin(String[] params) {
        String id = params[0];
        String type = params[1];
        String password = params[2];
        // Add try catch date
        LocalDate dateOfBirth = LocalDate.parse(params[3]);
        String username = params[4];
        String email = params[5];
        String name = params[6];


        Admin admin = new Admin(username, password, dateOfBirth);

        admin.setId(id);

        admin.setEmail(email);

        admin.setName(name);

        admin.type = type;

        return admin;
    }

    public boolean update(HashMap<String, String> updateMap) {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        for (String key : updateMap.keySet()) {
            switch (key) {
                case "Username":
                    this.username = updateMap.get(key);
                    break;
                case "Type":
                    this.type = updateMap.get(key);
                    break;
                case "Name":
                    this.setName(updateMap.get(key));
                    break;
                case "Password":
                    this.setPassword(updateMap.get(key));
                    break;
                case "Email":
                    this.setEmail(updateMap.get(key));
                    break;
                case "DOB":
                    this.setDateOfBirth(LocalDate.parse(updateMap.get(key)));
                    break;
                default:
                    break;
            }
        }

        Boolean isChanged = false;

        String[] person = {super.getId(), this.type, this.getPassword(), this.getDateOfBirth()+"", this.username, this.getEmail(), this.getName()};

        try {
            isChanged = pdf.updateEntry(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isChanged;
    }

    // Takes in attributes of a car and create a car object. Sets its ID and add it to the database
    public void addCar(String manufacture, String model, LocalDate year, Double rentalCost, Boolean isRented) {
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId("CA:" + EntityId.generateId());
        
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        String carEntry = cdf.constructEntry(car);


        try {
            cdf.addEntry(carEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void editCar() {

    }

    public void confirmCarBooking() {

    }
}
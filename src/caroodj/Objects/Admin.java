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
        super.setType("admin");
    }

    public static Admin convertToAdmin(String[] params) {
        String id = params[0];
        String type = params[1];
        String password = params[2];
        LocalDate dateOfBirth = LocalDate.parse(params[3]);
        String username = params[4];
        String email = params[5];
        String name = params[6];


        Admin admin = new Admin(username, password, dateOfBirth);

        admin.setId(id);

        admin.setEmail(email);

        admin.setName(name);

        admin.setType(type);

        return admin;
    }

    public boolean update(HashMap<String, String> updateMap) {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        for (String key : updateMap.keySet()) {
            switch (key) {
                case "Username":
                    if (pdf.checkUsername(this.getId(), updateMap.get(key))) {
                        this.setUsername(updateMap.get(key));
                    } else {
                        return false;
                    }
                    break;
                case "Type":
                    this.setType(updateMap.get(key));
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

        String[] person = {super.getId(), this.getType(), this.getPassword(), this.getDateOfBirth()+"", this.getUsername(), this.getEmail(), this.getName()};
        try {
            Boolean isChanged = pdf.updateEntry(person);
            return isChanged;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

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
}
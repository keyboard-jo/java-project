package Objects;

import java.time.LocalDate;
import java.util.HashMap;

// Abbstarct class
public abstract class Person extends EntityId{
    public String type;
    private String password;
    public String username;
    private LocalDate dateOfBirth;

    // Optional
    private String email;
    private String name;

    public Person(String username, String password, LocalDate dateOfBirth) {
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    // Test function
    public void sayHello() {
        System.out.println("My name is " + this.username + ". I am a " + this.type);
    }
    
    // Encapsulation setter
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Encapsulation getter
    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Login to the Menu
    // Fix return of person
    public static String login(String username, String password) {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        if (pdf.checkPassword(username, password)) {
            HashMap<String, String> query = PersonDataFile.createQuery("*", username, "*", "*", "*", "*", "*");
            return pdf.queryDatabase(query).first()[0];
        }
        return null;
    }

    // Logout of the Menu
    public void logout() {

    };
}

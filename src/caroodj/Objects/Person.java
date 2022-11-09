package Objects;

import java.time.LocalDate;

public class Person extends EntityId{
    public String type;
    private String password;
    public String username;

    // Optional
    private String email;
    private String name;
    private LocalDate dateOfBirth;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
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
    public Person login() {
        PersonDatabaseSystem pds = new PersonDatabaseSystem("src\\caroodj\\Data\\Person.txt");
        if (pds.checkPassword(this.username, this.getPassword())) {
            return pds.queryByUsername(this.username);
        }
        return null;
    }

    // Logout of the Menu
    public void logout() {

    }
}

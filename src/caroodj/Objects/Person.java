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

    public static String login(String username, String password) {
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
        if (pdf.checkPassword(username, password)) {
            String[] queryCandidate = {"*", "*" , "*", "*", username , "*", "*"};
            HashMap<String, String> query = pdf.createQuery(queryCandidate);
            return pdf.queryDatabase(query).first()[0];
        }
        return null;
    }
}

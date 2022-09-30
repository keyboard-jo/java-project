package Objects;

/**
 * Admin
 */
public class Admin extends Person {

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
        super.type = "admin";
    }
}
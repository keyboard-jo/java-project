package Objects;
public class Person extends EntityId{
    public String firstName;
    public String lastName;
    public String type;
    private String password;
    public String username;

    public Person(String username) {
        this.username = username;
    }

    // Test function
    public void sayHello() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ". I am a " + this.type);
    }
    
    // Encapsulation setter
    private void setPassword(String password) {
        this.password = password;
    }

    // Encapsulation getter
    private String getPassword() {
        return this.password;
    }

    // Register to the DatabaseSystem
    public void register() {

    }

    // Login to the Menu
    public void login() {
        
    }

    // Logout of the Menu
    public void logout() {

    }
}

package Objects;
public class Person extends EntityId{
    public String firstName;
    public String lastName;
    public String type;
    private String password;

    public Person(String firtName, String lastName) {
        this.firstName = firtName;
        this.lastName = lastName;
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

    // TODO: Create function that can construct database entry and deconstruct database entry
    // TODO: Create function that can query database system
}

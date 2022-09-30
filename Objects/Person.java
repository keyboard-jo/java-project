package Objects;

import java.util.Random;;

public class Person {
    public String id;
    public String firstName;
    public String lastName;
    public String type;
    private String password;

    public Person(String firtName, String lastName) {
        this.firstName = firtName;
        this.lastName = lastName;
        this.id = generateId();
    }

    public void sayHello() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ". I am a " + this.type);
    }
    
    private String generateId() {
        Random random = new Random();
        Integer range = 100000000;
        Integer id = random.nextInt(range);
        return id.toString();
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getPassword() {
        return this.password;
    }

    public void register() {

    }

    public void login() {
        
    }

    public void logout() {

    }
}

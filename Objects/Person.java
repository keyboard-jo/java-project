package Objects;

public class Person {
    public String firstName;
    public String lastName;
    public String type;

    public Person(String firtName, String lastName) {
        this.firstName = firtName;
        this.lastName = lastName;
    }

    public void sayHello() {
        System.out.println("My name is " + this.firstName + " " + this.lastName);
    }
}

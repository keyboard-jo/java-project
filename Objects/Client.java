package Objects;

public class Client extends Person{

    private String password;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        super.type = "client";;
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

    public void createCarBooking() {

    }

    public void viewCarBookingHistory() {

    }
}

package Objects;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class Booking extends EntityId{
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isConfirmed;
    private Boolean isCanceled;
    private Car car;
    private Client client;
    private String paymentMethod;

    public Booking(LocalDate startDate, LocalDate endDate, Boolean isConfirmed, Boolean isCanceled, Car car, Client client, String paymentMethod) {
        this.car = car;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isConfirmed = isConfirmed;
        this.isCanceled = isCanceled;
        this.paymentMethod = paymentMethod;
    }
    
    public Car getCar() {
        return car;
    }
    public Client getClient() {
        return client;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Boolean getIsCanceled() {
        return isCanceled;
    }
    public Boolean getIsConfirmed() {
        return isConfirmed;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Boolean update(HashMap<String, String> updateMap) {
        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        for (String key : updateMap.keySet()) {
            switch (key) {
                case "Id":
                    super.setId(updateMap.get(key));
                    break;
                case "Start Date":
                    this.startDate = LocalDate.parse(updateMap.get(key));
                    break;
                case "End Date":
                    this.endDate = LocalDate.parse(updateMap.get(key));
                    break;
                case "Confirmed":
                    this.isConfirmed = Boolean.parseBoolean(updateMap.get(key));
                    break;
                case "Cancelled":
                    this.isCanceled = Boolean.parseBoolean(updateMap.get(key));
                    break;
                case "Car":
                    String[] queryCar = {updateMap.get(key), "*", "*", "*", "*", "*"};
                    this.car = cdf.queryDatabase(cdf.createQuery(queryCar)).first();
                    break;
                case "Client":
                    String[] queryClient = {updateMap.get(key), "*", "*", "*", "*", "*"};
                    this.client = Client.convertToClient(pdf.queryDatabase(pdf.createQuery(queryClient)).first());
                    break;
                case "Payment":
                    this.paymentMethod = updateMap.get(key);
                    break;
                default:
                    break;
            }
        }

        try {
            Boolean isChanged = bdf.updateEntry(this);
            return isChanged;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean record() throws IOException {
        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        bdf.addEntry(bdf.constructEntry(this));
        return true;
    }

    public Double calculateTotalCost() {
        return getCar().getRentalCost() * (ChronoUnit.DAYS.between(getStartDate(), getEndDate()));
    }
}

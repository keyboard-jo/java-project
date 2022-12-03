package Objects;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class Booking extends EntityId{
    public LocalDate startDate;
    public LocalDate endDate;
    public Boolean isConfirmed;
    public Boolean isCanceled;
    public Car car;
    public Client client;

    public Booking(LocalDate startDate, LocalDate endDate, Boolean isConfirmed, Boolean isCanceled, Car car, Client client) {
        this.car = car;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isConfirmed = isConfirmed;
        this.isCanceled = isCanceled;
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
                default:
                    break;
            }
        }

        Boolean isChanged = false;

        try {
            isChanged = bdf.updateEntry(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return isChanged;
    }
}

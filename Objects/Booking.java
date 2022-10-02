package Objects;

import java.util.Date;

public class Booking extends EntityId{
    Date startDate;
    Date endDate;
    Boolean isConfirmed;
    String clientId;
    Car car;
    Client client;

    public Booking(Date startDate, Date endDate, Boolean isConfirmed, Car car, Client client) {
        this.car = car;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isConfirmed = isConfirmed;
    }
}

package Objects;

import java.time.LocalDate;

public class Booking extends EntityId{
    LocalDate startDate;
    LocalDate endDate;
    Boolean isConfirmed;
    Boolean isPaid;
    Boolean isCanceled;
    String clientId;
    Car car;
    Client client;

    public Booking(LocalDate startDate, LocalDate endDate, Boolean isConfirmed, Boolean isPaid, Boolean isCanceled, Car car, Client client) {
        this.car = car;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isConfirmed = isConfirmed;
        this.isPaid = isPaid;
        this.isCanceled = isCanceled;
    }
}

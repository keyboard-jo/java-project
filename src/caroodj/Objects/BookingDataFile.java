package Objects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class BookingDataFile extends DataFile<Booking> {

    public BookingDataFile(String path) {
        super(path);
    }

    @Override
    public String constructEntry(Booking booking) {
        String entry = booking.getId() + ";" + booking.startDate + ";" + booking.endDate + ";" + booking.isConfirmed + ";" + booking.isCanceled + ";" + booking.car.getId() + ";" + booking.client.getId();
        return entry;
    }

    @Override
    public Booking deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

        LocalDate starDate = LocalDate.parse(attributes[1], formatter);
        LocalDate endDate = LocalDate.parse(attributes[2], formatter);

        Boolean isConfirmed = Boolean.parseBoolean(attributes[3]);
        Boolean isCanceled = Boolean.parseBoolean(attributes[4]);

        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        String[] queryCar = {attributes[5], "*", "*", "*", "*", "*"};

        Car car = cdf.queryDatabase(cdf.createQuery(queryCar)).first();

        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        String[] queryClient = {attributes[6], "*", "*", "*", "*", "*", "*"};

        String[] clientParams = pdf.queryDatabase(pdf.createQuery(queryClient)).first();

        Client client = Client.convertToClient(clientParams);

        Booking booking = new Booking(starDate, endDate, isConfirmed, isCanceled, car, client);

        return booking;
    }

    @Override
    public HashMap<String, String> createQuery(String[] booking) {
        HashMap<String, String> query = new HashMap<String, String>();

        query.put("Id", booking[0]);
        query.put("Start Date", booking[1]);
        query.put("End Date", booking[2]);
        query.put("Confirmed", booking[3]);
        query.put("Canceled", booking[4]);
        query.put("Car", booking[5]);
        query.put("Client", booking[6]);
        return null;
    }

    @Override
    public DataFileQueryOperator<Booking> queryDatabase(HashMap<String, String> query) {
        return null;
    }
    
}

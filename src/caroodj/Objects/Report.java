package Objects;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Report {
    public LocalDate startDate;
    public LocalDate endDate;
    private ArrayList<Client> topClient;
    private ArrayList<Car> topCar;
    private ArrayList<Booking> bookingRange;
    private HashMap<String, Double> clientToRent;
    private HashMap<String, Integer> carToCount;

    private Double totalSales = 0.0;
    private Integer nSales = 0;
    private Integer nClient = 0;
    private Integer nCar = 0;

    public Report (LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;

        calculateBookingRange();
        calculateTopClients();
        calculateTopCar();
        calculateStatistics();
    }

    public void setTopCar(ArrayList<Car> topCar) {
        this.topCar = topCar;
    }

    public void setTopClient(ArrayList<Client> topClient) {
        this.topClient = topClient;
    }

    public void setBookingRange(ArrayList<Booking> bookingRange) {
        this.bookingRange = bookingRange;
    }

    public void setCarToCount(HashMap<String, Integer> carToCount) {
        this.carToCount = carToCount;
    }

    public void setClientToRent(HashMap<String, Double> clientToRent) {
        this.clientToRent = clientToRent;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public void setnCar(Integer nCar) {
        this.nCar = nCar;
    }

    public void setnClient(Integer nClient) {
        this.nClient = nClient;
    }

    public void setnSales(Integer nSales) {
        this.nSales = nSales;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public Integer getnCar() {
        return nCar;
    }

    public Integer getnClient() {
        return nClient;
    }

    public Integer getnSales() {
        return nSales;
    }

    public ArrayList<Car> getTopCar() {
        return topCar;
    }

    public ArrayList<Client> getTopClient() {
        return topClient;
    }

    public ArrayList<Booking> getBookingRange() {
        return bookingRange;
    }

    public HashMap<String, Integer> getCarToCount() {
        return carToCount;
    }

    public HashMap<String, Double> getClientToRent() {
        return clientToRent;
    }

    public void calculateTopClients() {
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        HashMap<String, Double> clientIdToRent = new HashMap<String, Double>();

        for (Booking booking : getBookingRange()) {
            String clientId = booking.getClient().getId();

            if (clientIdToRent.containsKey(clientId)) {
                clientIdToRent.put(clientId, clientIdToRent.get(clientId) + booking.calculateTotalCost());
            } else {
                clientIdToRent.put(clientId, booking.calculateTotalCost());
            }
        }

        setClientToRent(clientIdToRent);

        ArrayList<String> clientIdListSorted = new ArrayList<String>();

        clientIdToRent.entrySet()
            .stream()
            .sorted((m1, m2) -> m1.getValue().compareTo(m2.getValue()))
            .forEach(m -> clientIdListSorted.add(m.getKey()));
        
        ArrayList<Client> clientSorted = new ArrayList<Client>();

        for (String clientId : clientIdListSorted) {
            String [] query = {clientId, "*", "*", "*", "*", "*", "*"};

            clientSorted.add(Client.convertToClient(pdf.queryDatabase(pdf.createQuery(query)).first()));
        }

        Collections.reverse(clientSorted);

        setTopClient(clientSorted);
    }

    public void calculateTopCar() {

        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        HashMap<String, Integer> carIdToCount = new HashMap<String, Integer>();
        

        for (Booking booking : getBookingRange()) {
            String carId = booking.getCar().getId();

            if (carIdToCount.containsKey(carId)) {
                carIdToCount.put(carId, carIdToCount.get(carId) + 1);
            } else {
                carIdToCount.put(carId, 1);
            }
        }

        setCarToCount(carIdToCount);

        ArrayList<String> carIdListSorted = new ArrayList<String>();

        carIdToCount.entrySet()
            .stream()
            .sorted((m1, m2) -> m1.getValue().compareTo(m2.getValue()))
            .forEach(m -> carIdListSorted.add(m.getKey()));

        ArrayList<Car> carSorted = new ArrayList<Car>();

        for (String carId : carIdListSorted) {
            String [] query = {carId, "*", "*", "*", "*", "*"};

            carSorted.add(cdf.queryDatabase(cdf.createQuery(query)).first());
        }

        Collections.reverse(carSorted);

        setTopCar(carSorted);

    }

    public void calculateBookingRange() {
        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");

        String startDateQuery = this.startDate + " " + this.endDate;

        String[] query = {"*", startDateQuery, "*", "true", "false", "*", "*", "*"};

        setBookingRange(bdf.queryDatabase(bdf.createQuery(query)).all());
    }

    public void calculateStatistics() {
        CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

        ArrayList<String> carIdList = new ArrayList<String>();

        ArrayList<String> clientIdList = new ArrayList<String>();
        

        for (Booking booking : getBookingRange()) {
            String carId = booking.getCar().getId();

            String clientId = booking.getClient().getId();

            this.totalSales += booking.calculateTotalCost();

            this.nSales += 1;

            if (!carIdList.contains(carId)) {
                this.nCar += 1;
                carIdList.add(carId);
            }

            if (!clientIdList.contains(clientId)) {
                this.nClient += 1;
                clientIdList.add(clientId);
            }
        }
    }
}

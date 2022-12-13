package Objects;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookingDataFile extends DataFile<Booking> {

    public BookingDataFile(String path) {
        super(path);
    }

    @Override
    public String constructEntry(Booking booking) {
        String entry = booking.getId() + ";" + booking.getStartDate() + ";" + booking.getEndDate() + ";" + booking.getIsConfirmed() + ";" + booking.getIsCanceled() + ";" + booking.getCar().getId() + ";" + booking.getClient().getId() + ";" + booking.getPaymentMethod();
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

        String paymentMeyhod = attributes[7];

        Booking booking = new Booking(starDate, endDate, isConfirmed, isCanceled, car, client, paymentMeyhod);

        booking.setId(attributes[0]);

        return booking;
    }

    @Override
    public HashMap<String, String> createQuery(String[] booking) {
        HashMap<String, String> query = new HashMap<String, String>();

        query.put("Id", booking[0]);
        query.put("Start Date", booking[1]);
        query.put("End Date", booking[2]);
        query.put("Confirmed", booking[3]);
        query.put("Cancelled", booking[4]);
        query.put("Car", booking[5]);
        query.put("Client", booking[6]);
        query.put("Payment", booking[7]);
        return query;
    }

    public Boolean updateEntry(Booking booking) throws IOException {
        Scanner dataFileRead = super.openFileRead();

        ArrayList<Booking> bookingList = new ArrayList<Booking>();

        Boolean isChanged = false;

        while (dataFileRead.hasNextLine()) {
            Booking bookingData = deconstructEntry(dataFileRead.nextLine());
            if (bookingData.getId().equals(booking.getId())) {
                bookingList.add(booking);
                isChanged = true;
            } else {
                bookingList.add(bookingData);
            }
        }

        dataFileRead.close();

        BufferedWriter dataFileWrite = super.openFileWrite();
        for (Booking bookingData: bookingList) {
            String entry = constructEntry(bookingData);
            dataFileWrite.write(entry + System.lineSeparator());
        }
        dataFileWrite.close();

        return isChanged;
    }


    @Override
    public DataFileQueryOperator<Booking> queryDatabase(HashMap<String, String> query) {
        Scanner datafile = super.openFileRead();
        
        ArrayList<Booking> bookingList = new ArrayList<Booking>();
        ArrayList<Booking> arrayBooking = new ArrayList<Booking>();

        String id = query.get("Id");
        String startDate = query.get("Start Date");
        String endDate = query.get("End Date");
        String isConfirmed = query.get("Confirmed");
        String isCancelled = query.get("Cancelled");
        String carId = query.get("Car");
        String clientId = query.get("Client");
        String paymentMehod = query.get("Payment");

        String [] featureVal = {id, startDate, endDate, isConfirmed, isCancelled, carId, clientId, paymentMehod};

        while (datafile.hasNextLine()) {
            String data = datafile.nextLine();
            Booking booking = deconstructEntry(data);
            if (!super.isStar(featureVal[0])) {
                if (booking.getId().equals(featureVal[0])) {
                    bookingList.add(booking);
                }
            } else {
                bookingList.add(booking);
            }
        }

        datafile.close();


        for (Integer i = 1; i < featureVal.length; i++) {
            if (!super.isStar(featureVal[i])) {
                for (Booking booking : bookingList) {
                    if (i == 1) {
                        Boolean isRangeStartDate = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeStartDate) {
                            String [] startDateRange = featureVal[i].split(" ", 2);
                            if (startDateRange[0].equals("*")) {
                                LocalDate startDateHigh = LocalDate.parse(startDateRange[1]);
                                if (super.isLower(booking.getStartDate(), startDateHigh)) {
                                    arrayBooking.add(booking);
                                }
                            } else if (startDateRange[1].equals("*")) {
                                LocalDate startDateLow = LocalDate.parse(startDateRange[0]);
                                if (super.isHigher(booking.getStartDate(), startDateLow)) {
                                    arrayBooking.add(booking);
                                }
                            } else {
                                LocalDate startDateHigh = LocalDate.parse(startDateRange[1]);
                                LocalDate startDateLow = LocalDate.parse(startDateRange[0]);
                                if (super.isBetween(startDateLow, booking.getStartDate(), startDateHigh)) {
                                    arrayBooking.add(booking);
                                }

                            }
                        } else {
                            LocalDate startDateEqual = LocalDate.parse(featureVal[i]);
                            if (booking.getStartDate().equals(startDateEqual)) {
                                arrayBooking.add(booking);
                            }
                        }
                    } else if (i == 2) {
                        Boolean isRangeEndDate = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeEndDate) {
                            String [] endDateRange = featureVal[i].split(" ", 2);
                            if (endDateRange[0].equals("*")) {
                                LocalDate endDateHigh = LocalDate.parse(endDateRange[1]);
                                if (super.isLower(booking.getEndDate(), endDateHigh)) {
                                    arrayBooking.add(booking);
                                }
                            } else if (endDateRange[1].equals("*")) {
                                LocalDate endDateLow = LocalDate.parse(endDateRange[0]);
                                if (super.isHigher(booking.getEndDate(), endDateLow)) {
                                    arrayBooking.add(booking);
                                }
                            } else {
                                LocalDate endDateHigh = LocalDate.parse(endDateRange[1]);
                                LocalDate endDateLow = LocalDate.parse(endDateRange[0]);
                                if (super.isBetween(endDateLow, booking.getEndDate(), endDateHigh)) {
                                    arrayBooking.add(booking);
                                }

                            }
                        } else {
                            LocalDate endDateEqual = LocalDate.parse(featureVal[i]);
                            if (booking.getEndDate().equals(endDateEqual)) {
                                arrayBooking.add(booking);
                            }
                        }
                    } else if (i == 3) {
                        if (booking.getIsConfirmed().equals(Boolean.parseBoolean(featureVal[i]))) {
                            arrayBooking.add(booking);
                        }
                    } else if (i == 4) {
                        if (booking.getIsCanceled().equals(Boolean.parseBoolean(featureVal[i]))) {
                            arrayBooking.add(booking);
                        }

                    } else if (i == 5) {
                        if (booking.getCar().getId().equals(featureVal[i])) {
                            arrayBooking.add(booking);
                        }
                    } else if (i == 6) {
                        if (booking.getClient().getId().equals(featureVal[i])) {
                            arrayBooking.add(booking);
                        }
                    } else if (i == 7) {
                        if (booking.getPaymentMethod().equals(featureVal[i])) {
                            arrayBooking.add(booking);
                        } 
                    }
                }    
            bookingList.clear();
            bookingList = (ArrayList<Booking>)arrayBooking.clone();
            arrayBooking.clear();
            }
        }
        super.dfqo.setLastQuery(bookingList);
        return super.dfqo;
    }
    
}

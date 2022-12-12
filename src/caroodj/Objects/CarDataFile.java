package Objects;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarDataFile extends DataFile<Car>{

    public CarDataFile(String path) {
        super(path);
    }

    // Query database based on hashmap
    public DataFileQueryOperator<Car> queryDatabase(HashMap<String, String> query) {
        Scanner dataFile = super.openFileRead();
        
        ArrayList<Car> carList = new ArrayList<Car>();
        ArrayList<Car> arrayCar = new ArrayList<Car>();

        String id = query.get("Id");
        String manufacture = query.get("Manufacture");
        String model = query.get("Model");

        String isRented = query.get("Rented");

        String dateBuild = query.get("Year");
        String rent = query.get("Rent");

        String[] featureVal = {id, manufacture, model, isRented, dateBuild, rent};

        while (dataFile.hasNextLine()) {
            String data = dataFile.nextLine();
            Car car = deconstructEntry(data);
            if (!super.isStar(id)) {
                if (car.getId().equals(id)) {
                    carList.add(car);
                }
            } else {
                carList.add(car);
            }
        }

        dataFile.close();

        for (Integer i = 1; i < featureVal.length; i++) {
            if (!super.isStar(featureVal[i])) {
                for (Car car : carList) {
                    if (i == 1) {
                        if (car.getManufacture().equals(featureVal[i])) {
                            arrayCar.add(car);
                        }
                    } else if (i == 2) {
                        if (car.getModel().equals(featureVal[i])) {
                            arrayCar.add(car);
                        }
                    } else if (i == 3) {
                        if (car.getIsRented().equals(Boolean.parseBoolean(featureVal[i]))) {
                            arrayCar.add(car);
                        }
                    } else if (i == 4) {
                        Boolean isRangeDate = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeDate) {
                            String[] yearsRange = featureVal[i].split(" ", 2);
                            if (yearsRange[0].equals("*")) {
                                LocalDate yearHigh = LocalDate.parse(yearsRange[1]);
                                if (super.isLower(car.getYear(), yearHigh)) {
                                    arrayCar.add(car);
                                }
                            } else if (yearsRange[1].equals("*")) {
                                LocalDate yearLow = LocalDate.parse(yearsRange[0]);
                                if (super.isHigher(car.getYear(), yearLow)) {
                                    arrayCar.add(car);
                                }
                            } else {
                                LocalDate yearLow = LocalDate.parse(yearsRange[0]);
                                LocalDate yearHigh = LocalDate.parse(yearsRange[1]);
                                if (super.isBetween(yearLow, car.getYear(), yearHigh)) {
                                    arrayCar.add(car);
                                }
                            }
                        } else {
                            LocalDate year = LocalDate.parse(featureVal[i]);
                            if (car.getYear().equals(year)) {
                                arrayCar.add(car);
                            }
                        }
                    } else if (i == 5) {
                        Boolean isRangeDouble = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeDouble) {
                            String[] rentRange = featureVal[i].split(" ", 2);
                            if (rentRange[0].equals("*")) {
                                Double rentHigh = Double.parseDouble(rentRange[1]);
                                if (super.isLower(car.getRentalCost(), rentHigh)) {
                                    arrayCar.add(car);
                                }
                            } else if (rentRange[1].equals("*")) {
                                Double rentLow = Double.parseDouble(rentRange[0]);
                                if (super.isHigher(car.getRentalCost(), rentLow)) {
                                    arrayCar.add(car);
                                }
                            } else {
                                Double rentLow = Double.parseDouble(rentRange[0]);
                                Double rentHigh = Double.parseDouble(rentRange[1]);
                                if (super.isBetween(rentLow, car.getRentalCost(), rentHigh)) {
                                    arrayCar.add(car);
                                }
                            }
                        } else {
                            Double rentDouble = Double.parseDouble(featureVal[i]);
                            if (car.getRentalCost().equals(rentDouble)) {
                                arrayCar.add(car);
                            }
                        }
                    }
                }
                carList.clear();
                carList = (ArrayList<Car>)arrayCar.clone();
                arrayCar.clear();
            }
        }

        super.dfqo.setLastQuery(carList);
        return super.dfqo;
    }

    public HashMap<String, String> createQuery(String[] car) {
        HashMap<String, String> query = new HashMap<String, String>();

        query.put("Id", car[0]);
        query.put("Manufacture", car[1]);
        query.put("Model", car[2]);
        query.put("Year", car[3]);
        query.put("Rent", car[4]);
        query.put("Rented", car[5]);
        return query;
    }

    public String constructEntry(Car car) {
        String entry = car.getId() + ";" + car.getManufacture() + ";" + car.getModel() + ";" + car.getYear() + ";" + car.getRentalCost() + ";" + car.getYear();
        return entry;
    }

    public Car deconstructEntry(String entry) {
        String[] attributes = entry.split(";");
        String manufacture = attributes[1];
        String model = attributes[2];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

        LocalDate year = LocalDate.parse(attributes[3], formatter);
        Double rentalCost = Double.parseDouble(attributes[4]);
        Boolean isRented = Boolean.parseBoolean(attributes[5]);
        Car car = new Car(manufacture, model, year, rentalCost, isRented);
        car.setId(attributes[0]);
        return car;
    }

    public void removeEntry(String id) throws IOException {
        Scanner dataFileRead = this.openFileRead();

        ArrayList<String> entries = new ArrayList<String>();

        while (dataFileRead.hasNextLine()) {
            String data = dataFileRead.nextLine();
            if (!data.split(";")[0].equals(id)) {
                entries.add(data);
            }
        }

        dataFileRead.close();

        BufferedWriter dataFileWrite = this.openFileWrite();

        for (String entry: entries) {
            dataFileWrite.write(entry + System.lineSeparator());
        }
        dataFileWrite.close();

        entries.clear();

        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        Scanner dataFileReadBooking = bdf.openFileRead();

        while (dataFileReadBooking.hasNextLine()) {
            String data = dataFileReadBooking.nextLine();
            if (!data.split(";")[5].equals(id)) {
                entries.add(data);
            }
        }

        dataFileReadBooking.close();

        BufferedWriter dataFileWriteBooking = bdf.openFileWrite();

        for (String entry: entries) {
            dataFileWriteBooking.write(entry + System.lineSeparator());
        }

        dataFileWriteBooking.close();
    }

    @Override
    public Boolean updateEntry(Car car) throws IOException {
        Scanner dataFileRead = super.openFileRead();

        ArrayList<Car> carList = new ArrayList<Car>();

        Boolean isChanged = false;

        while (dataFileRead.hasNextLine()) {
            Car carData = deconstructEntry(dataFileRead.nextLine());
            if (carData.getId().equals(car.getId())) {
                carList.add(car);
                isChanged = true;
            } else {
                carList.add(carData);
            }
        }

        dataFileRead.close();

        BufferedWriter dataFileWrite = super.openFileWrite();
        for (Car carData: carList) {
            String entry = constructEntry(carData);
            dataFileWrite.write(entry + System.lineSeparator());
        }
        dataFileWrite.close();

        return isChanged;
    }
}

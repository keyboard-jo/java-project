package Objects;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// TODO: Fix range query for car and booking, fix the range to account for "x *" and "* x"

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
                        if (car.manufacture.equals(featureVal[i])) {
                            arrayCar.add(car);
                        }
                    } else if (i == 2) {
                        if (car.model.equals(featureVal[i])) {
                            arrayCar.add(car);
                        }
                    } else if (i == 3) {
                        if (car.isRented.equals(Boolean.parseBoolean(featureVal[i]))) {
                            arrayCar.add(car);
                        }
                    } else if (i == 4) {
                        Boolean isRangeDate = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeDate) {
                            String[] yearsRange = featureVal[i].split(" ", 2);
                            if (yearsRange[0].equals("*")) {
                                LocalDate yearHigh = LocalDate.parse(yearsRange[1]);
                                if (super.isLower(car.year, yearHigh)) {
                                    arrayCar.add(car);
                                }
                            } else if (yearsRange[1].equals("*")) {
                                LocalDate yearLow = LocalDate.parse(yearsRange[0]);
                                if (super.isHigher(car.year, yearLow)) {
                                    arrayCar.add(car);
                                }
                            } else {
                                LocalDate yearLow = LocalDate.parse(yearsRange[0]);
                                LocalDate yearHigh = LocalDate.parse(yearsRange[1]);
                                if (super.isBetween(yearLow, car.year, yearHigh)) {
                                    arrayCar.add(car);
                                }
                            }
                        } else {
                            LocalDate year = LocalDate.parse(featureVal[i]);
                            if (car.year.equals(year)) {
                                arrayCar.add(car);
                            }
                        }
                    } else if (i == 5) {
                        Boolean isRangeDouble = featureVal[i].split(" ", 2).length > 1;
                        if (isRangeDouble) {
                            String[] rentRange = featureVal[i].split(" ", 2);
                            if (rentRange[0].equals("*")) {
                                Double rentHigh = Double.parseDouble(rentRange[1]);
                                if (super.isLower(car.rentalCost, rentHigh)) {
                                    arrayCar.add(car);
                                }
                            } else if (rentRange[1].equals("*")) {
                                Double rentLow = Double.parseDouble(rentRange[0]);
                                if (super.isHigher(car.rentalCost, rentLow)) {
                                    arrayCar.add(car);
                                }
                            } else {
                                Double rentLow = Double.parseDouble(rentRange[0]);
                                Double rentHigh = Double.parseDouble(rentRange[1]);
                                if (super.isBetween(rentLow, car.rentalCost, rentHigh)) {
                                    arrayCar.add(car);
                                }
                            }
                        } else {
                            Double rentDouble = Double.parseDouble(featureVal[i]);
                            if (car.rentalCost.equals(rentDouble)) {
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
        String entry = car.getId() + ";" + car.manufacture + ";" + car.model + ";" + car.year + ";" + car.rentalCost + ";" + car.isRented;
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

    @Override
    public Boolean updateEntry(Car objectT) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }
}

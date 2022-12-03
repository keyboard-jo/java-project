package Objects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public abstract class DataFile<T> {
    String path;
    public DataFileQueryOperator<T> dfqo = new DataFileQueryOperator<T>(null);
    public DataFile(String path) {
        this.path = path;
    }

    // Open file in read mode
    public Scanner openFileRead() {
        try {
            File dataFile = new File(this.path);
            Scanner dataFileReader = new Scanner(dataFile);
            // System.out.println("File exist!");
            return dataFileReader;
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            e.printStackTrace();
        }
        return null;
    }

    // Open file in write mode
    public BufferedWriter openFileWrite() {
        try {
            BufferedWriter dataFile = new BufferedWriter(new FileWriter(this.path));
            // System.out.println("File exist!");
            return dataFile;
        } catch (IOException e) {
            System.out.println("File does not exists!");
            e.printStackTrace();
        }
        return null;
    }

    // Open file in append mode
    public BufferedWriter openFileAppend() {
        try {
            BufferedWriter dataFile = new BufferedWriter(new FileWriter(this.path, true));
            return dataFile;
        } catch (IOException e) {
            System.out.println("File does not exists!");
            e.printStackTrace();
        }
        return null;
    }

    // Add entry to the database
    public void addEntry(String entry) {
        BufferedWriter dataFile = this.openFileAppend();
        try {
            dataFile.write(entry + System.lineSeparator());
            dataFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String constructEntry(T objectT);
    public abstract T deconstructEntry(String val);
    public abstract HashMap<String, String> createQuery(String[] argument);
    public abstract DataFileQueryOperator<T> queryDatabase(HashMap<String, String> query);
    public abstract Boolean updateEntry(T objectT);

    // TODO: Seperate this methods into different object
    // Operators
    public static Boolean isBetween(Double start, Double val, Double end) {
        return !(val < start || val > end);
    }

    public static Boolean isBetween(LocalDate start, LocalDate val, LocalDate end) {
        return !(val.isBefore(start) || val.isAfter(end));
    
    }

    public static Boolean isHigher(Double val, Double cmpr) {
        return (val >= cmpr);
    }

    public static Boolean isHigher(LocalDate val, LocalDate cmpr) {
        Integer i = val.compareTo(cmpr);
        return (i >= 0);
    }

    public static Boolean isLower(Double val, Double cmpr) {
        return (val <= cmpr);
    }

    public static Boolean isLower(LocalDate val, LocalDate cmpr) {
        Integer i = val.compareTo(cmpr);
        return (i <= 0);
    }

    public static Boolean isStar(String val) {
        if ((val.split(" ", 2).length > 1)) {
            if ((val.split(" ", 2)[0].equals("*")) && (val.split(" ", 2)[1].equals("*"))) {
                return true;
            }
        }
        return (val.equals("*")) ? true : false;
    }
}

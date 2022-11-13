package Objects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFile<T> {
    String path;
    ArrayList<T> lastQuery;
    public DataFile(String path) {
        this.path = path;
    }

    // Open file in read mode
    public Scanner openFileRead() {
        try {
            File dataFile = new File(this.path);
            Scanner dataFileReader = new Scanner(dataFile);
            System.out.println("File exist!");
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
            System.out.println("File exist!");
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

    // Operators
    public static Boolean isBetween(Double start, Double val, Double end) {
        return !(val < start || val > end);
    }

    public static Boolean isBetween(LocalDate start, LocalDate val, LocalDate end) {
        return !(val.isBefore(start) || val.isAfter(end));
    }

    public static Boolean isStar(String val) {
        return (val == "*") ? true : false;
    }

    public T first() {
        return (T) this.lastQuery.get(0);
    }
}

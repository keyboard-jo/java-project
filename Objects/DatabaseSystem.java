package Objects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DatabaseSystem {
    String path;
    public DatabaseSystem(String path) {
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
}

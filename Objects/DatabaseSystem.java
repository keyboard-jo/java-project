package Objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatabaseSystem {
    String path;
    public DatabaseSystem(String path) {
        this.path = path;
    }

    public Scanner openFile() {
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
}

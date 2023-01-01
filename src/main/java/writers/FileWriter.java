package writers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class FileWriter {

    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(FileWriter.class);
    public void writeObjectToFile(Object obj, File file){
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error");
        }
    }
}

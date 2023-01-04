package writers;

import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

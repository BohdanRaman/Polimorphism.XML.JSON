package writers;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;

public class FileWriter {

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

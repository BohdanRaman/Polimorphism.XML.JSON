package writers;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriter {

    public void writeObjectToFile(Object obj, File file){
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
            fos.flush();
            fos.close();
            oos.close();
        } catch (IOException exception) {
            throw new RuntimeException("Attention, object wasn't write in file.");
        }
    }
}

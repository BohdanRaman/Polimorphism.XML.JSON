package writers;

import java.io.*;

public class FileWriter {

    public void writeObjectToFile(Object obj, File file){

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            PrintStream printStream = new PrintStream(fos);
            printStream.println(oos);
            oos.flush();
            fos.flush();
            fos.close();
            System.out.println("Write to file completed");
        } catch(IOException e) {
            System.out.println("Attention, the file has been written");
        }
    }
}


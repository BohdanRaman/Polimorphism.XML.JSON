package template_files;

import java.io.Serializable;

public class TemplateFileXML implements FileType, CountNumberPassword, Serializable {
    public static final long serialVersionUID = 1L;

    @Override
    public void getNameFile() {
        System.out.println("File name: XML");
    }

    @Override
    public void getUsersListSize(int sizeList) {
        if (sizeList > 0 && sizeList < 3) {
            System.out.println("Small users list");
        }
        if (sizeList >= 3 && sizeList < 10) {
            System.out.println("Medium users list");
        }
        if (sizeList >= 10) {
            System.out.println("Big users list");
        }
    }

    @Override
    public void getCountNumberPassword(int count) {
        String countNumber = "";
        countNumber = (count > 8) ? "Good password" : "Bad password";
        System.out.println(countNumber);
    }
}


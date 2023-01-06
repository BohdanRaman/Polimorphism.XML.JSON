package template_files;

import java.io.Serializable;

public class TemplateFileJSON implements FileType, Serializable {
    public static final long serialVersionUID = 1L;

    @Override
    public void getNameFile() {
        System.out.println("File name: JSON");
    }

    @Override
    public void getUsersListSize(int users) {
        if (users > 0 && users < 3) {
            System.out.println("Small users list");
        }
        if (users >= 3 && users < 10) {
            System.out.println("Medium users list");
        }
        if (users >= 10) {
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


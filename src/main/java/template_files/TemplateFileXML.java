package template_files;

import java.io.Serializable;

public class TemplateFileXML extends TemplateFileJSON implements InformationAboutFile, CountNumberPassword, Serializable {
    public static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        return "TemplateFileXML: " +
                "nameAccount = " + getNameAccount() +
                ", loginAccount = " + getLoginAccount();
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: XML");
    }

    @Override
    public void getUsersListSize(int listSize) {
        if (listSize > 0 && listSize < 3) {
            System.out.println("Small users list");
        }
        if (listSize >= 3 && listSize < 10) {
            System.out.println("Medium users list");
        }
        if (listSize >= 10) {
            System.out.println("Big users list");
        }
    }

    @Override
    public void getCountNumberPassword(int count) {
        String countNumber = "";
        countNumber = (count > 8) ? "You use good password" : "You use bad password";
        System.out.println(countNumber);
    }
}


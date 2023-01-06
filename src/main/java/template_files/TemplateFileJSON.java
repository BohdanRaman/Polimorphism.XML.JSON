package template_files;

import java.io.Serializable;

public class TemplateFileJSON implements InformationAboutFile, Serializable {
    public static final long serialVersionUID = 1L;

    private String nameAccount;
    private String loginAccount;

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
       this.nameAccount = nameAccount;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: JSON");
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

    @Override
    public String toString() {
        return "TemplateFileJSON: " +
                "nameAccount = " + getNameAccount() +
                ", loginAccount = " + getLoginAccount();
    }
}


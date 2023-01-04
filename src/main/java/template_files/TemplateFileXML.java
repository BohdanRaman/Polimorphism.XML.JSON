package template_files;

public class TemplateFileXML implements FileType {
    private String nameAccount;
    private String loginAccount;
    private int countNumberPasswordAccount;

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

    public int getCountNumberPasswordAccount() {
        return countNumberPasswordAccount;
    }

    public void setCountNumberPasswordAccount(int countNumberPasswordAccount) {
        this.countNumberPasswordAccount = countNumberPasswordAccount;
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: XML");
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

    public String toStringXML() {
        return "TemplateFileXML: " +
                "nameAccount= " + getNameAccount().toUpperCase() +
                ", loginAccount= " + getLoginAccount() +
                ", countNumberPasswordAccount= " + getCountNumberPasswordAccount();
    }
}


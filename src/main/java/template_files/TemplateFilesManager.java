package template_files;

public class TemplateFilesManager {
    private static TemplateFilesManager manager;

    public static TemplateFilesManager getInstance() {
        if (manager == null) {
            manager = new TemplateFilesManager();
        }
        return manager;
    }

    private String nameAccount;
    private String loginAccount;
    private int countNumberPasswordAccount;

    public TemplateFilesManager() {
    }

    public TemplateFilesManager(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        this.nameAccount = nameAccount;
        this.loginAccount = loginAccount;
        this.countNumberPasswordAccount = countNumberPasswordAccount;
    }

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

    public void printAccountFile(String fileName) {
        System.out.println("File name: " + fileName);
    }

    public TemplateFilesManager getFile(GenerateFiles generateFiles) {
        if (generateFiles == null) {
            throw new IllegalArgumentException("File can't open in your browser!");
        }
        return switch (generateFiles) {
            case XML -> new TemplateFileXML("a", "b", 24);
            case JSON -> new TemplateFileXML("c", "d", 24);
        };
    }
}


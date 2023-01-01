package template_files;

import java.io.Serializable;

public class TemplateFileJSON extends TemplateFilesManager implements Serializable {
    public static final long serialVersionUID = 1L;
    public TemplateFileJSON(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        super(nameAccount, loginAccount, countNumberPasswordAccount);
    }

    @Override
    public void printAccountFile(String fileName) {
        System.out.println("JSON: " + fileName);
    }

    @Override
    public String toString() {
        return "Template file JSON: login - " + getLoginAccount() + ", account name - " + getNameAccount() +
                ", count number Password - " + getCountNumberPasswordAccount();
    }
}

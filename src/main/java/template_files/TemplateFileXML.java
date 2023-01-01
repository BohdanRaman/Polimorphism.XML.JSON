package template_files;

import java.io.Serializable;

public class TemplateFileXML extends TemplateFilesManager implements Serializable {
    public static final long serialVersionUID = 1L;
    public TemplateFileXML(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        super(nameAccount, loginAccount, countNumberPasswordAccount);
    }

    @Override
    public void printAccountFile(String fileName) {
        System.out.println("XML: " + fileName);
    }

    @Override
    public String toString() {
        return "Template file XML: login - " + getLoginAccount() + ", account name - " + getNameAccount() +
                ", count number Password - " + getCountNumberPasswordAccount();
    }
}


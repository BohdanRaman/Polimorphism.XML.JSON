package template_files;

import java.io.Serializable;

public class TemplateFileXML implements Serializable {
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
}


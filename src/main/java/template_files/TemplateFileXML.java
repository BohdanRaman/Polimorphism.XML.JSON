package template_files;

import java.io.Serializable;

public class TemplateFileXML extends TemplateFileJSON implements Serializable {
    public static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "TemplateFileXML: " +
                "nameAccount = " + getNameAccount() +
                ", loginAccount = " + getLoginAccount();
    }
}


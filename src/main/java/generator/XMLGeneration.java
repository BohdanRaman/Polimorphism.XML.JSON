package generator;

import template_files.TemplateFile;

public class XMLGeneration extends TemplateFile implements InformationAboutFile {

    @Override
    public void templateFile() {
        System.out.println("<?xml version=\"1.0\"?>\n" +
                           "<body>\n" +
                           "<name_account id=\"1\"><" + getNameAccount() + "</name_account>\n" +
                           "<login_account id=\"2\">" + getLoginAccount() + "</login_account>\n" +
                           "<body>");
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: XML");
    }
}

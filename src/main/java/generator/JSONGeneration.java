package generator;

import template_files.TemplateFileJSON;

public class JSONGeneration extends TemplateFileJSON implements InformationAboutFile {

    @Override
    public void templateFile() {
        System.out.println("[  " + "\n"
                           + "   {   \"name account: \"" + getNameAccount() + "," + "\n"
                           + "       \"login account: \"" + getLoginAccount() + "\n"
                           + "    }" + "\n" +
                           "]");
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: JSON");
    }
}

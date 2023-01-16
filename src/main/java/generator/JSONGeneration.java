package generator;

import template_files.TemplateFile;

public class JSONGeneration extends TemplateFile implements InformationAboutFile {

    @Override
    public void templateFile() {
        System.out.println("[  " + "\n"
                           + "   {   \"name account: \"" + getNameAccount() + "\"," + "\n"
                           + "       \"login account: \"" + getLoginAccount() + "\""+ "\n"
                           + "    }" + "\n" +
                           "]");
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: JSON");
    }
}

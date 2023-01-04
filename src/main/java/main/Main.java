package main;

import generator.FileGenerationType;
import template_files.*;
import writers.FileWriter;

public class Main {
    public static void main(String[] args) {
        TemplateFilesManager templateFilesManager = new TemplateFilesManager();
        FileType xml = templateFilesManager.generateFile(FileGenerationType.XML);
        FileType json = templateFilesManager.generateFile(FileGenerationType.JSON);

        TemplateFileXML templateFileXML = new TemplateFileXML();
        templateFileXML.setNameAccount("Xml");
        templateFileXML.setLoginAccount("superFilE");
        templateFileXML.setCountNumberPasswordAccount(8);
        xml.getNameFile();
        xml.getUsersListSize(5);
        System.out.println(templateFileXML.toStringXML());
        System.out.println();

        TemplateFileJSON templateFileJSON = new TemplateFileJSON();
        templateFileJSON.setNameAccount("jSoN");
        templateFileJSON.setLoginAccount("1234Login");
        templateFileJSON.setCountNumberPasswordAccount(16);
        System.out.println(templateFileJSON.toStringJSON());
        json.getNameFile();
        json.getUsersListSize(14);
        /* If I need to add more info to generate file, I should create new interface and do implement him */


        FileWriter writer = new FileWriter();
        //  writer.writeObjectToFile(fileJSON, new File("FFF.txt"));
    }
}
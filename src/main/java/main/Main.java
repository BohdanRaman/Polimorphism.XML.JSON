package main;

import generator.FileGenerationType;
import template_files.*;
import writers.FileWriter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        TemplateFilesManager templateFilesManager = new TemplateFilesManager();
        TemplateFileXML fileXML = new TemplateFileXML();
        TemplateFileJSON fileJSON = new TemplateFileJSON();
        InformationAboutFile xml = templateFilesManager.generateFile(FileGenerationType.XML);
        InformationAboutFile json = templateFilesManager.generateFile(FileGenerationType.JSON);

        fileXML.setLoginAccount("ABCxml");
        fileXML.setNameAccount("xmlxml");
        fileJSON.setLoginAccount("123json");
        fileJSON.setNameAccount("jsonjson");
        System.out.println(fileXML);
        System.out.println(fileJSON);
        System.out.println();

        xml.getNameFile();
        xml.getUsersListSize(5);
        xml.getCountNumberPassword(16);
        System.out.println();

        json.getNameFile();
        json.getUsersListSize(14);
        json.getCountNumberPassword(8);
        /* If I need to add more info to generate file, I should create new interface and do implement him */

        FileWriter writer = new FileWriter();
        writer.writeObjectToFile(xml, new File("FileXML.txt"));
        writer.writeObjectToFile(json, new File("FileJSON.txt"));
    }
}
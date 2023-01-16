package main;

import generator.FileGenerationType;
import generator.InformationAboutFile;
import generator.JSONGeneration;
import generator.XMLGeneration;
import template_files.*;
import writers.FileWriter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        TemplateFilesManager templateFilesManager = new TemplateFilesManager();
        JSONGeneration fileJSON = new JSONGeneration();
        XMLGeneration fileXML = new XMLGeneration();
        InformationAboutFile xml = templateFilesManager.generateFile(FileGenerationType.XML);
        InformationAboutFile json = templateFilesManager.generateFile(FileGenerationType.JSON);

        fileXML.setLoginAccount("XMLlogin");
        fileXML.setNameAccount("name account 'XML'");
        fileJSON.setLoginAccount("JSONlogin");
        fileJSON.setNameAccount("name account 'JSON'");

        xml.getNameFile();
        fileXML.templateFile();
        System.out.println();

        json.getNameFile();
        fileJSON.templateFile();
        System.out.println();

        /* If I need to add more info to generate file, I should create new interface and do implement him */

        FileWriter writer = new FileWriter();
        writer.writeObjectToFile(fileXML, new File("FileXML.txt"));
        writer.writeObjectToFile(fileJSON, new File("FileJSON.txt"));
    }
}
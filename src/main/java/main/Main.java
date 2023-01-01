package main;

import template_files.GenerateFiles;
import template_files.TemplateFileJSON;
import template_files.TemplateFileXML;
import template_files.TemplateFilesManager;
import writers.FileWriter;

import java.io.File;
public class Main {
    public static void main(String[] args){
        TemplateFilesManager.getInstance();
        TemplateFilesManager fileJSON = new TemplateFileJSON("Bob", "bObBOMBA12345", 8);
        TemplateFilesManager fileXML = new TemplateFileXML("Tom", "TOM_topchik", 16);

        System.out.println(new TemplateFilesManager().getFile(GenerateFiles.JSON));
        System.out.println(new TemplateFilesManager().getFile(GenerateFiles.XML));

        fileJSON.printAccountFile("Template file JSON");
        fileXML.printAccountFile("Template file XML");
        System.out.println(fileJSON);
        System.out.println(fileXML);

        FileWriter writer = new FileWriter();
        writer.writeObjectToFile(fileJSON, new File("FFF.txt"));
    }
}
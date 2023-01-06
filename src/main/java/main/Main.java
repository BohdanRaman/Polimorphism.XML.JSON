package main;

import generator.FileGenerationType;
import template_files.*;
import writers.FileWriter;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        TemplateFilesManager templateFilesManager = new TemplateFilesManager();
        FileType xml = templateFilesManager.generateFile(FileGenerationType.XML);
        FileType json = templateFilesManager.generateFile(FileGenerationType.JSON);

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
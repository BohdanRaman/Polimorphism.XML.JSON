package template_files;

import generator.FileGenerationType;
import generator.InformationAboutFile;
import generator.JSONGeneration;
import generator.XMLGeneration;

public class TemplateFilesManager{

    public TemplateFilesManager() {
    }

    public InformationAboutFile generateFile(FileGenerationType generateFile) {
        if (generateFile == null) {
            throw new IllegalArgumentException("File can't open in your browser!");
        }
        return switch (generateFile) {
            case XML -> new JSONGeneration();
            case JSON -> new XMLGeneration();
        };
    }
}


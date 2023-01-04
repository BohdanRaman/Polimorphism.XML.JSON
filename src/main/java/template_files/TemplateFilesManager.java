package template_files;

import generator.FileGenerationType;

public class TemplateFilesManager {
    private static TemplateFilesManager manager;

    public static TemplateFilesManager getInstance() {
        if (manager == null) {
            manager = new TemplateFilesManager();
        }
        return manager;
    }

    public TemplateFilesManager() {
    }

    public FileType generateFile(FileGenerationType generateFile) {
        if (generateFile == null) {
            throw new IllegalArgumentException("File can't open in your browser!");
        }
        return switch (generateFile) {
            case XML -> new TemplateFileXML();
            case JSON -> new TemplateFileJSON();
        };
    }
}


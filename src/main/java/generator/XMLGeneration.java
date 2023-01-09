package generator;

public class XMLGeneration implements InformationAboutFile {
    @Override
    public void templateFile() {
        System.out.println("""
                <?xml version="1.0"?>
                <list_of_refactoring_code>
                <refactoring_code id="1"><first</refactoring_code>
                <refactoring_code id="2">second</refactoring_code>
                <refactoring_code id="3">third</refactoring_code>
                <refactoring_code id="4"><last</refactoring_code>
                </refactoring_code>""");
    }

    @Override
    public void getNameFile() {
        System.out.println("File name: XML");
    }
}

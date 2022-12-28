public class Main {
    public static void main(String[] args) {

        BaseClass baseClass = BaseClass.getInstance();
        SpecificationFiles json = new JSON("Volodya", "Chack", 8);
        SpecificationFiles xml = new XML("Bob", "Zheka", 16);
        CreateFile createFile = new CreateFile(json);
        BaseClass bs = createFile.createFiles();
        if (bs!=null){
            System.out.println(bs);
        }
    }
}

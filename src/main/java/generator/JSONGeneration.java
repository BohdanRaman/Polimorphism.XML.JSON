package generator;

public class JSONGeneration implements InformationAboutFile{
    @Override
    public void templateFile() {
        System.out.println("""
                [
                        {
                            "value": "Raman Bohdan",
                            "unrestricted_value": "Raman Bohdan",
                            "data": {
                                "surname": "Bohdan",
                                "name": "Raman",
                                "status": JavaTrainee,
                                "company": Asist-lab.com,
                                "gender": "MALE"
                            }
                        }
                ]""");

    }

    @Override
    public void getNameFile() {
        System.out.println("File name: JSON");
    }
}

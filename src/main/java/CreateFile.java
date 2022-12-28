public class CreateFile {

    private final SpecificationFiles specification;

    public CreateFile(SpecificationFiles specification) {
        super();
        this.specification = specification;
        if (this.specification == null) {
            throw new IllegalArgumentException("File can't open in your browser!");
        }
    }

    public BaseClass createFiles() {
        return specification.printAccountFile().countUser().build();
    }
}


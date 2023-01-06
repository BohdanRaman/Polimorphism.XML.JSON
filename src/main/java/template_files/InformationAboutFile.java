package template_files;

public interface InformationAboutFile extends CountNumberPassword {

    void getNameFile();

    void getUsersListSize(int listSize);

    @Override
    void getCountNumberPassword(int count);
}

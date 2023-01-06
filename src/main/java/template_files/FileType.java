package template_files;

public interface FileType extends CountNumberPassword {

    void getNameFile();

    void getUsersListSize(int sizeList);

    @Override
    void getCountNumberPassword(int count);
}

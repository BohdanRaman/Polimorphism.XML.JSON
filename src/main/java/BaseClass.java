public class BaseClass {

    private static BaseClass manager;

    public static BaseClass getInstance() {
        if (manager == null) {
            manager = new BaseClass();
        }
        return manager;
    }

    private String nameAccount;
    private String loginAccount;
    private int countNumberPasswordAccount;

    public BaseClass() {

    }

    public BaseClass(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        this.nameAccount = nameAccount;
        this.loginAccount = loginAccount;
        this.countNumberPasswordAccount = countNumberPasswordAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public int getCountNumberPasswordAccount() {
        return countNumberPasswordAccount;
    }

    public void setCountNumberPasswordAccount(int countNumberPasswordAccount) {
        this.countNumberPasswordAccount = countNumberPasswordAccount;
    }

}

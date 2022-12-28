public class XML extends BaseClass implements SpecificationFiles {
    public XML(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        super(nameAccount, loginAccount, countNumberPasswordAccount);
    }

    @Override
    public SpecificationFiles printAccountFile() {
        return null;
    }

    @Override
    public SpecificationFiles countUser() {
        return null;
    }

    @Override
    public BaseClass build() {
        BaseClass baseClass = new BaseClass(build().getNameAccount(), getLoginAccount(), getCountNumberPasswordAccount());
        if (baseClass == null) {
            System.out.println("Error");
        }
        return baseClass;
    }
}

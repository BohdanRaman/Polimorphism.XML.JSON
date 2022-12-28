public class JSON extends BaseClass implements SpecificationFiles {
    public JSON(String nameAccount, String loginAccount, int countNumberPasswordAccount) {
        super(nameAccount, loginAccount, countNumberPasswordAccount);
    }

    @Override
    public SpecificationFiles printAccountFile() {
        return this;
    }

    @Override
    public SpecificationFiles countUser() {
        return this;
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

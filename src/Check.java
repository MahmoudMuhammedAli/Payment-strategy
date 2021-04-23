public class Check extends Payment {
    private String name;
    private String bankID;
    private IprintBehavior p = new PrintNon();
    private IauthorizeBehavior a = new AuthorizeCheck();

    public Check(String name, String id) {
        super();
        this.name = name;
        this.bankID = id;
    }

    @Override
    public String states() {
        return "the bill was paid via a check and the print is    " + p.printReceipt() + "authorization is:" + a.authorized();
    }
}

public class Cash extends Payment {
    private float cashTendered;
    private IprintBehavior p = new PrintCashTrans();
    private IauthorizeBehavior a = new AuthorizedNon();

    public Cash(float c) {
        super();
        this.cashTendered = c;
    }

    @Override
    public String states() {
        return "cash was used to pay the bill and     " + p.printReceipt() + "authorization is:" + a.authorized();
    }
}

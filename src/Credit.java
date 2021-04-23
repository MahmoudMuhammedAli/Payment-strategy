import java.util.Date;

public class Credit extends Payment{
    private String name ;
    private String type;
    private Date expDate;
    private IprintBehavior p = new PrintCashTrans();
    private IauthorizeBehavior a = new AuthorizeCredit2();

    public Credit(String name , String type, Date exp){
        super();
        this.name = name;
        this.type= type;
        this.expDate=exp;
    }

    @Override
    public String states() {
        return "A credit was used and     " + p.printReceipt() + "authorization is:" + a.authorized();
    }
}

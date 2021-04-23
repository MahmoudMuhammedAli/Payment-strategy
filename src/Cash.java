public class Cash extends Payment {
    private float cashTendered ;
    public Cash(float c){
        super();
        this.cashTendered=c;
    }

    @Override
    public String states() {
        return "cash was used to pay the bill";
    }
}

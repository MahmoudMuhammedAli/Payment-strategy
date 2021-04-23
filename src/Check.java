public class Check extends Payment{
    private String name;
    private String bankID;
    public Check(String name, String id){
        super();
    this.name = name;
    this.bankID=id;
    }
    @Override
    public String states() {
        return "the bill was paid via a check";
    }
}

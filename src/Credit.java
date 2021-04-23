import java.util.Date;

public class Credit extends Payment{
    private String name ;
    private String type;
    private Date expDate;

    public Credit(String name , String type, Date exp){
        super();
        this.name = name;
        this.type= type;
        this.expDate=exp;
    }

    @Override
    public String states() {
        return "A credit was used";
    }
}

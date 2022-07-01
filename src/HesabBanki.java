import static java.lang.Math.pow;

public class HesabBanki {
    String name ;
    String accountNumber  ;
    long idNumber ;
    double inventory ;
    String  buildDate ;

    static long  bankCardNumber= (long)( Math.random()*pow(10,16)) ;
    public HesabBanki(String name, String accountNumber, long idNumber, double inventory, String buildDate) {
        this.name = name;
        this.accountNumber =accountNumber;
        this.idNumber = idNumber;
        this.inventory = inventory;
        this.buildDate = buildDate;
        this.bankCardNumber=bankCardNumber;
    }
    @Override
    public String toString() {
        return "HesabBanki\n{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                ", bankCardNumber=" + bankCardNumber +
                '}';
    }
}

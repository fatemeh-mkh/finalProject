public class ShortTerm extends HesabSeporde{
    static int bankProfitsPercent ;
    static int SetDuration ;
    public ShortTerm(String name, String  accountNumber, long idNumber, long inventory, String buildDate, int negativeScore, String AccountType) {
        super(name, accountNumber, idNumber, inventory, buildDate, AccountType);
        bankProfitsPercent=10 ;
        SetDuration=10;
    }
    @Override
    public String toString() {
        return "ShortTerm{" +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                "AccountType='" + AccountType + '\'' +
                '}';
    }
}


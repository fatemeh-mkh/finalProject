public class LongTerm extends HesabSeporde{
    static int bankProfitsPercent ;
    static int SetDuration ;
    public LongTerm(String name, String  accountNumber, long idNumber, long inventory, String buildDate, int negativeScore,String AccountType) {
        super(name, accountNumber, idNumber, inventory, buildDate, AccountType);
        bankProfitsPercent=30 ;
        SetDuration=30;
    }
    @Override
    public String toString() {
        return "LongTerm{" +
                "AccountType='" + AccountType + '\'' +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                '}';
    }
}

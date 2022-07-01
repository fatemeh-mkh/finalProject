public class SpecialAccount extends HesabSeporde {
    static int bankProfitsPercent ;
    static int SetDuration ;
    public SpecialAccount(String name, String  accountNumber, long idNumber, long inventory, String buildDate, int negativeScore,String AccountType ) {
        super(name, accountNumber, idNumber, inventory, buildDate, AccountType);
        bankProfitsPercent=50 ;
        SetDuration=50 ;
    }
    @Override
    public String toString() {
        return "SpecialAccount{" +
                "AccountType='" + AccountType + '\'' +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                '}';
    }
}

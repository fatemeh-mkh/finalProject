public class HesabSeporde extends HesabBanki{
    String AccountType ;
    public HesabSeporde(String name, String accountNumber, long idNumber, long inventory, String buildDate, String accountType) {
        super(name, accountNumber, idNumber, inventory, buildDate);
        AccountType=this.AccountType;
    }
    @Override
    public String toString() {
        return "HesabSeporde{" +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                "AccountType='" + AccountType + '\'' +
                '}';
    }
}

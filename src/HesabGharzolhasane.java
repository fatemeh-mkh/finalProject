public class HesabGharzolhasane extends HesabBanki{
    long bankCardNumber ;
    public HesabGharzolhasane(String name, String  accountNumber, long idNumber, long inventory, String buildDate, int negativeScore, long bankCardNumber) {
        super(name, accountNumber, idNumber, inventory, buildDate);
        this.bankCardNumber =this.bankCardNumber ;
    }
    @Override
    public String toString() {
        return "HesabJari{" +
                "bankCardNumber=" + bankCardNumber +
                ", name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", idNumber=" + idNumber +
                ", inventory=" + inventory +
                ", buildDate='" + buildDate + '\'' +
                '}';
    }
}

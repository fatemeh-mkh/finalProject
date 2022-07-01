public class HesabJari extends HesabBanki{
    String Cheque;
    long bankCardNumber ;
    public HesabJari(String name, String  accountNumber, long idNumber, long inventory, String buildDate, int negativeScore) {
        super(name, accountNumber, idNumber, inventory, buildDate);
        bankCardNumber= this.bankCardNumber;
        Cheque=this.Cheque;
    }
}


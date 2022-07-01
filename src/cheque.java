public class cheque {
    double chequeAmount ;
    long accountNumberExporter;
    long accountNumberRecipient ;
    long ShebaNumber ;

    public cheque(double chequeAmount, long accountNumberExporter, long accountNumberRecipient, long shebaNumber) {
        this.chequeAmount = chequeAmount;
        this.accountNumberExporter = accountNumberExporter;
        this.accountNumberRecipient = accountNumberRecipient;
        ShebaNumber = shebaNumber;
    }
    @Override
    public String toString() {
        return "cheque{" +
                "chequeAmount=" + chequeAmount +
                ", accountNumberExporter=" + accountNumberExporter +
                ", accountNumberRecipient=" + accountNumberRecipient +
                ", ShebaNumber=" + ShebaNumber +"\n"+
                '}';
    }
}

public class Loan {
    String  accountNumber;
    double loanAmount ;
    double inventory;

    int loanProfitPercent;
    int negativeScore ;

    public Loan(String accountNumber, double loanAmount, double inventory, int loanProfitPercent, int negativeScore) {
        this.accountNumber = accountNumber;
        this.loanAmount = loanAmount;
        this.inventory = inventory;
        this.loanProfitPercent = loanProfitPercent;
        this.negativeScore = negativeScore;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "accountNumber=" + accountNumber +
                ", loanAmount=" + loanAmount +
                ", inventory=" + inventory +
                ", loanProfitPercent=" + loanProfitPercent +
                ", negativeScore=" + negativeScore +"\n"+
                '}';
    }
}


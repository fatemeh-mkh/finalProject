import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ModiriatBank {
    public static ArrayList<EtelaatShakhs> PersonInfoList = new ArrayList<>(); ///--->list of shakhs
    public static ArrayList<HesabBanki> hesabBankiList = new ArrayList<>();
    public static ArrayList<HesabSeporde> hesabSepordeList = new ArrayList<>();
    public static ArrayList<Loan> loanList = new ArrayList<>();
    public static ArrayList<cheque>chequeList=new ArrayList<>();
    //**********************************************************************************
    public static void HesabBanki(String name, String accountNumber, long idNumber, long inventory, String buildDate, long bankCardNumber) {//add list of bankInfo
        hesabBankiList.add(new HesabBanki(name, accountNumber, idNumber, inventory, buildDate));
    }
    public static void makeSepordeAccount(String name, String accountNumber, long idNumber, long inventory, String buildDate, String AccountType) {//add list of bankInfo
        hesabSepordeList.add(new HesabSeporde(name, accountNumber, idNumber, inventory, buildDate, AccountType));
    }
    public static double dipositFunds(double depositMoney, String accountNumber) {
        double amount = 0;
        for (int i = 0; i < ModiriatBank.hesabBankiList.size(); i++) {
            if (ModiriatBank.hesabBankiList.get(i).accountNumber.equals(accountNumber)) {
                ModiriatBank.hesabBankiList.get(i).inventory = (ModiriatBank.hesabBankiList.get(i).inventory + depositMoney);
                amount = ModiriatBank.hesabBankiList.get(i).inventory;
            }
        }
        return amount;
    }

    public static double withdrawMoney(double withdrawMoney, String accountNumber) {
        double amount = 0;
        for (int i = 0; i < ModiriatBank.hesabBankiList.size(); i++) {
            if (ModiriatBank.hesabBankiList.get(i).accountNumber.equals(accountNumber)) {
                ModiriatBank.hesabBankiList.get(i).inventory = (double) (ModiriatBank.hesabBankiList.get(i).inventory - withdrawMoney);
                amount = ModiriatBank.hesabBankiList.get(i).inventory;
            }
        }
        return amount;
    }

    public static void transferMoney(String accountNumber1,String accountNumber2, double transferAmount) {
        for (int i = 0; i < ModiriatBank.hesabBankiList.size(); i++) {
            if (ModiriatBank.hesabBankiList.get(i).accountNumber.equals(accountNumber1)) {
                ModiriatBank.hesabBankiList.get(i).inventory= ModiriatBank.hesabBankiList.get(i).inventory-transferAmount;
            }
        }
        for (int i = 0; i < ModiriatBank.hesabBankiList.size(); i++) {
            if (ModiriatBank.hesabBankiList.get(i).accountNumber.equals(accountNumber2)) {
                ModiriatBank.hesabBankiList.get(i).inventory=  ModiriatBank.hesabBankiList.get(i).inventory+transferAmount;
            }
        }
    }


    public static boolean checkUserOfBank(String name, String accountNumber) {
        boolean search = false;
        for (int i = 0; i < ModiriatBank.hesabBankiList.size(); i++) {
            if (hesabBankiList.get(i).name.equals(name)) {
                if (hesabBankiList.get(i).accountNumber.equals(accountNumber)) {
                    search = true;
                    break;
                }
            }
        }
        return search;
    }

    public static long TermProfit(long inventory, String accountNumber, int DayOfSeporde) {
        int Emtiaz = DayOfSeporde / 10;
        long lastInventory = 0;
        lastInventory = (((inventory * Emtiaz) / 100) + inventory);
        return lastInventory;
    }

    public static void addListOfLoan(String accountNumber, double loanAmount, double inventory, int loanProfitPercent, int negativeScore) {
        inventory = loanAmount + inventory;
        loanList.add(new Loan(accountNumber, loanAmount, inventory, loanProfitPercent, negativeScore));
    }

    public static double PayInstallmentSixMounth(String accountNumber, double loanAmount, double inventory, long initialLoanAmount, int installmentNumber) {
        for (int i = 0; i < ModiriatBank.loanList.size(); i++) {
            if (loanList.get(i).accountNumber.equals(accountNumber)) {
                if (ModiriatBank.loanList.get(i).inventory >= ModiriatBank.loanList.get(i).loanAmount) {
                    double eachInstallment = loanAmount * (ModiriatBank.loanList.get(i).loanProfitPercent + 1) / 6;
                    ModiriatBank.loanList.get(i).inventory = ModiriatBank.loanList.get(i).inventory - eachInstallment;
                    inventory = ModiriatBank.loanList.get(i).inventory;
                    installmentNumber--;
                    if(installmentNumber==0){
                        System.out.println("All installments of this loan were paid.Thank you dear user :)");
                    }
                }
            } else if (inventory <= initialLoanAmount) {
                int negativeScore = loanList.get(i).negativeScore + 1;
                if (negativeScore == 5) {
                    loanList.remove(i);
                }
            }
        }
        return inventory;
    }
    public static double PayInstallmentTwelveMounth(String accountNumber, double loanAmount, double inventory, long initialLoanAmount, int installmentNumber) {

        for (int i = 0; i < ModiriatBank.loanList.size(); i++) {
            if (loanList.get(i).accountNumber.equals(accountNumber)) {
                if (ModiriatBank.loanList.get(i).inventory >= ModiriatBank.loanList.get(i).loanAmount) {
                    double eachInstallment = loanAmount * (ModiriatBank.loanList.get(i).loanProfitPercent + 1) /12;
                    ModiriatBank.loanList.get(i).inventory = ModiriatBank.loanList.get(i).inventory - eachInstallment;
                    inventory = ModiriatBank.loanList.get(i).inventory;
                    installmentNumber--;
                    if(installmentNumber==0){
                        System.out.println("All installments of this loan were paid.Thank you dear user :)");
                    }
                }
            } else if (inventory <= initialLoanAmount) {
                int negativeScore = loanList.get(i).negativeScore + 1;
                if (negativeScore == 5) {
                    loanList.remove(i);
                }
            }
        }
        return inventory;
    }
    public static void getBankCheque(double chequeAmount ,long accountNumberExporter,long accountNumberRecipient,long ShebaNumber){
        chequeList.add(new cheque(chequeAmount, accountNumberExporter,accountNumberRecipient,ShebaNumber));
    }
    public static void writeBanklistOnFile(){
        File filename=new File("C:\\Users\\KCC\\Desktop\\BankList.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i <= ModiriatBank.hesabBankiList.size()-1; i++) {
                output.write(ModiriatBank.hesabBankiList.get(i).toString() + "\n");
                output.write(ModiriatBank.hesabSepordeList.get(i).toString()+"\n");
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "that file cannot create.");
        }
    }
    public static void writeChequeListOnFile(){
        File filename=new File("C:\\Users\\KCC\\Desktop\\ChequeList.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i <= ModiriatBank.chequeList.size()-1; i++) {
                output.write(ModiriatBank.chequeList.toString() + "\n");
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "that file cannot create.");
        }
    }
    public static void writeLoanListOnFile() throws IOException{
        File filename=new File("C:\\Users\\KCC\\Desktop\\LoanList.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i <= ModiriatBank.loanList.size()-1; i++) {
                output.write(ModiriatBank.loanList.toString() + "\n");
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "that file cannot create.");
        }
    }
    public static void readHesabBankiListOnFile(){
        ArrayList list1=new ArrayList();
        String filename = "C:\\Users\\KCC\\Desktop\\BankList.txt";
        String line;
        try {
            BufferedReader input1=new BufferedReader(new FileReader((filename)));
            if(!input1.ready()){
                throw new IOException();
            }
            while (( line=input1.readLine())!=null){
                list1.add(line);
            }
            input1.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0; i<=list1.size();i++){
            System.out.println(list1.toString());
        }
    }
    public static void readChequeListOnFile(){
        ArrayList list2=new ArrayList();
        String filename = "C:\\Users\\KCC\\Desktop\\ChequeList.txt";
        String line;
        try {
            BufferedReader input1=new BufferedReader(new FileReader((filename)));
            if(!input1.ready()){
                throw new IOException();
            }
            while (( line=input1.readLine())!=null){
                list2.add(line);
            }
            input1.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0; i<=list2.size();i++){
            System.out.println(list2.toString());
        }
    }
    public static void readLoanListOnFile(){
        ArrayList list3=new ArrayList();
        String filename = "C:\\Users\\KCC\\Desktop\\LoanList.txt";
        String line;
        try {
            BufferedReader input1=new BufferedReader(new FileReader((filename)));
            if(!input1.ready()){
                throw new IOException();
            }
            while (( line=input1.readLine())!=null){
                list3.add(line);
            }
            input1.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0; i<=ModiriatBank.hesabBankiList.size();i++){
            System.out.println(list3.toString());
        }
    }
    public static void writeOnfile(){

    }
}

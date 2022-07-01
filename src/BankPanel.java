import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.nextUp;
import static java.lang.Math.pow;
public class BankPanel {
    static Scanner input = new Scanner(System.in);
    public void makeAccount() throws InvalidInputException {//add list of bankInfo
        while (true) {
            System.out.println("[Choose your desired option]\n1:Hesab Jari\n2:Hesab Gharzorlhasane\n3:Hesab Seporde\n4:exit");
            int input5 = input.nextInt();
            switch (input5) {
                case 1:
                    System.out.println("Please enter name, account Number, Idnumber,inventory,buildDate ");
                    System.out.println("name:");
                    String name = input.next();
                    System.out.println(" account Number:");
                    String accountNumber = input.next();
                    System.out.println("  Idnumber:");
                    long idNumber = input.nextLong();
                    System.out.println("inventory:");
                    long inventory = input.nextLong();
                    System.out.println("buildDate:");
                    String buildDate = input.next();
                    System.out.println("Card Number:");
                    long bankCardNumber = (long) ((long) Math.random() * pow(10, 16));
                    ModiriatBank.HesabBanki(name, String.valueOf(accountNumber), idNumber, inventory, buildDate, bankCardNumber);
                    System.out.println("[list of members accounts]\n" + ModiriatBank.hesabBankiList.toString());
                    System.out.println("Do you want to add another account more??\n1:Yes\n2:No");
                    int input1 = input.nextInt();
                    if (input1 == 1) {
                        continue;
                    } else if (input1 == 2) {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Please enter name, account Number, Idnumber,inventory,buildDate ");
                    System.out.println("name:");
                    name = input.next();
                    System.out.println("account Number:");
                    accountNumber = input.next();
                    System.out.println("Idnumber:");
                    idNumber = input.nextLong();
                    System.out.println("inventory:");
                    inventory = input.nextLong();
                    System.out.println("buildDate:");
                    buildDate = input.next();
                    System.out.println("Card Number:");
                    bankCardNumber = HesabBanki.bankCardNumber;
                    ModiriatBank.HesabBanki(name, String.valueOf(accountNumber), idNumber, inventory, buildDate, bankCardNumber);
                    System.out.println("[list of members accounts]\n" + ModiriatBank.hesabBankiList.toString());
                    break;
                case 4:
                    System.out.println("Invalid input...");
                    return;
                default:
                    System.out.println("Invalid input...");
                    throw new InvalidInputException();

                case 3:
                    System.out.println("[Please choose your desied number]\n1:Make Seporde account\n2:Show account profit\n");
                    int input6 = input.nextInt();
                    if (input6 == 1) {
                        System.out.println("Please enter name, account Number, Idnumber,inventory,buildDate, type of Account ");
                        System.out.println("name:");
                        name = input.next();
                        System.out.println("account Number:");
                        accountNumber = input.next();
                        System.out.println("Idnumber:");
                        idNumber = input.nextLong();
                        System.out.println("inventory:");
                        long inventory1 = input.nextLong();
                        System.out.println("buildDate:");
                        buildDate = input.next();
                        System.out.println("Account type:");
                        String AccountType = input.next();
                        ModiriatBank.makeSepordeAccount(name, accountNumber, idNumber, inventory1, buildDate, AccountType);
                        System.out.println("[list of members accounts]\n"+ ModiriatBank.hesabSepordeList.toString());
                        System.out.println("Is there any Account to add more?\n1:Yes\n2:No");
                        input1 = input.nextInt();
                        if (input1 == 1) {
                            continue;
                        } else if (input1 == 2) {
                            break;
                        }
                        break;
                    } else if (input6 == 2) {
                        System.out.println("Please choose type of your Seporde.");
                        System.out.println("1:SHORT_TERM\n2:LONG_TERM3:SPECIAL");
                        int input7 = input.nextInt();
                        switch (input7) {
                            case 1:
                                System.out.println("Please enter your Account number .");
                                System.out.println("account Number:");
                                String accountNumber1 = input.next();
                                System.out.println("Inventory:");
                                long inventory1=input.nextLong();
                                System.out.println("daySeporde:");
                                int daySeporde =input.nextInt();
                                if (daySeporde>=10 && daySeporde<30){
                                    long Inventory=ModiriatBank.TermProfit(inventory1,accountNumber1,daySeporde);
                                    System.out.println("Short term profit : "+ Inventory);
                                    int input9= input.nextInt();
                                    if (input9 == 1) {
                                        continue;
                                    } else if (input9 == 2) {
                                        break;
                                    }
                                    break;
                                }
                            case 2:
                                System.out.println("Please enter your Account number .");
                                System.out.println("account Number:");
                                accountNumber1 = input.next();
                                System.out.println("Inventory:");
                                inventory1=input.nextLong();
                                System.out.println("daySeporde:");
                                daySeporde =input.nextInt();
                                if(daySeporde>=30 && daySeporde<50) {
                                    long Inventory = ModiriatBank.TermProfit(inventory1, accountNumber1, daySeporde);
                                    System.out.println("Long term profit : " + Inventory);
                                }
                                input1 = input.nextInt();
                                if (input1 == 1) {
                                    continue;
                                } else if (input1 == 2) {
                                    break;
                                }
                                break;
                            case 3:
                                System.out.println("Please enter your Account number .");
                                System.out.println("account Number:");
                                accountNumber1 = input.next();
                                System.out.println("Inventory:");
                                inventory1=input.nextLong();
                                System.out.println("daySeporde:");
                                daySeporde =input.nextInt();
                                if(daySeporde>=50) {
                                    long Inventory = ModiriatBank.TermProfit(inventory1, accountNumber1, daySeporde);
                                    System.out.println("Special term profit : " + Inventory);
                                }
                                input1 = input.nextInt();
                                if (input1 == 1) {
                                    continue;
                                } else if (input1 == 2) {
                                    break;
                                }
                                break;
                        }
                    }
                case 5:
                    break;
            }
        }
    }
    public void dipositAmount () {
        while (true) {
            System.out.println("Please enter name and Account number of user.\nName:");
            String name = input.next();
            System.out.println("Account number:");
            String AccountNumber = input.next();
            boolean test = ModiriatBank.checkUserOfBank(name, AccountNumber);
            if (test == true) {
                System.out.println("Please enter number of amount for deposit\namount:");
                double amount = input.nextDouble();
                ModiriatBank.dipositFunds(amount, AccountNumber);
                System.out.println("last amount" + ModiriatBank.hesabBankiList);
                System.out.println("Do you want to add another amount??\n1:Yes\n2:No");
                int input1 = input.nextInt();
                if (input1 == 1) {
                    continue;
                } else if (input1 == 2) {
                    break;
                }
            } else if (test == false) {
                System.out.println("There is no user with this name and account!!!!!");
                break;
            }
        }
    }
    public void whithdrawAmount() {

        while (true) {
            System.out.println("Please enter name and Account number of user.\nName:");
            String name = input.next();
            System.out.println("Account number:");
            String AccountNumber = input.next();
            boolean test = ModiriatBank.checkUserOfBank(name, AccountNumber);
            if (test == true) {
                System.out.println("Please enter number of amount for Withdraw\namount:");
                double amount = input.nextDouble();
                ModiriatBank.withdrawMoney(amount, AccountNumber);
                System.out.println("last amount" + ModiriatBank.hesabBankiList);
                System.out.println("Do you want to reduce another amount??\n1:Yes\n2:No");
                int input1 = input.nextInt();
                if (input1 == 1) {
                    continue;
                } else if (input1 == 2) {
                    break;
                }
            } else if (test == false) {
                System.out.println("There is no user with this name and account!!!!!");
                break;
            }
        }
    }
    public void moneyTransfer() {
        while (true) {
            System.out.println("Please enter name and Account number of user.\nName:");
            String name = input.next();
            System.out.println("Account number 1:");
            String AccountNumber1 = input.next();
            boolean test = ModiriatBank.checkUserOfBank(name, AccountNumber1);
            if (test == true) {
                System.out.println("Please enter number of amount for transfer\namount:");
                double trsferAmount = input.nextDouble();
                System.out.println("Please enter Account number 2 for transfer:");
                String AccountNumber2 = input.next();
                ModiriatBank.transferMoney(AccountNumber1, AccountNumber2,trsferAmount);
                System.out.println("Transfer operation successfully performed" + ModiriatBank.hesabBankiList);
                System.out.println("Do you want to transfer another amount??\n1:Yes\n2:No");
                int input1 = input.nextInt();
                if (input1 == 1) {
                    continue;
                } else if (input1 == 2) {
                    break;
                }
            } else if (test == false) {
                System.out.println("There is no user with this name and account!!!!!");
                break;
            }
        }
    }
    public void getLoan(){
        System.out.println("please enter String accountNumber,loanAmount,inventory,loan profit,negative Score");
        System.out.println("Account Number:");
        String accountNumber=input.next();
        System.out.println("loanAmount:");
        double loanAmount=input.nextDouble();
        System.out.println("inventory:");
        double inventory=input.nextDouble();
        System.out.println("loan profit:");
        int loanProfit= 1 + (int) (Math.random() * 100);
        System.out.println("Negative Score:");
        int NegativeScore=input.nextInt();
        ModiriatBank.addListOfLoan(accountNumber,loanAmount,inventory,loanProfit,NegativeScore);
    }
    public void PayInstallmentsBanklist(){
        System.out.println("please enter accountNumber, loanAmount, inventory, initialLoanAmount,installmentNumber");
        System.out.println("Account Number:");
        String accountNumber=input.next();
        System.out.println("loan Amount:");
        double loanAmount=input.nextDouble();
        System.out.println("Inventory:");
        double inventory=input.nextDouble();
        System.out.println("Initial Loan Amount:");
        long initialLoanAmount =100;
        System.out.println("Installment Number:\t(6 or 12)");
        int InstallmentNumber=input.nextInt();
        if(InstallmentNumber==6){
            System.out.println(ModiriatBank.PayInstallmentSixMounth( accountNumber, loanAmount, inventory,initialLoanAmount, InstallmentNumber));
        } else if (InstallmentNumber==12) {
            System.out.println(ModiriatBank.PayInstallmentTwelveMounth( accountNumber, loanAmount, inventory,initialLoanAmount, InstallmentNumber));
        }
    }
    public void recieveCheque(){
        System.out.println("[Recieve Cheque]\n\nPlease enter cheque Amount,Exporter Account Number,Recipient accountNumber and Sheba number. ");
        double chequeAmount=input.nextDouble() ;
        long accountNumberExporter=input.nextLong();
        long accountNumberRecipient=input.nextLong() ;
        long shebaNumber=input.nextLong();
        ModiriatBank.getBankCheque( chequeAmount, accountNumberExporter, accountNumberRecipient,shebaNumber);
        System.out.println(ModiriatBank.chequeList.toString());
    }

    class InvalidInputException extends Exception {
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class BankUserPanel {
    public void BankUserPanel() throws InvalidInputException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("--Welcome to Bank System--");
        while (true) {
            System.out.println("(Choose your desired option)\n1:build account types\n2:deposit funds\n3:withdraw funds\n4:Money Transfer\n5:receive cheques\n6:collect cheques\n7:recieve Loan\n8:Recovery Iformation\n9:Exit");
            int input4 = input.nextInt();
            switch (input4) {
                case 1:
                    BankPanel v = new BankPanel();
                    v.makeAccount();
                    break;
                case 2:
                    BankPanel x = new BankPanel();
                    x.dipositAmount();
                    break;
                case 3:
                    BankPanel n = new BankPanel();
                    n.whithdrawAmount();
                    break;
                case 4:
                    BankPanel d = new BankPanel();
                    d.moneyTransfer();
                    break;
                case 5:
                    BankPanel y = new BankPanel();
                    y.recieveCheque();
                    break;
                case 6:
                    break;
                case 7:
                    BankPanel z = new BankPanel();
                    z.PayInstallmentsBanklist();
                    break;
                case 8:
                    System.out.println("1:Recovery Bank list\n2:Recovery Cheque list\n3:Recovery Loan list");
                    int input7=input.nextInt();
                    switch (input7){
                        case 1:
                            ModiriatBank.readHesabBankiListOnFile();
                            break;
                        case 2:
                            ModiriatBank.readChequeListOnFile();
                            break;
                        case 3:
                            ModiriatBank.readLoanListOnFile();
                            break;
                    }
                    System.out.println("Do you want to recovery more files?\n1:Yes\n2:No");
                    int input1 = input.nextInt();
                    if (input1 == 1) {
                        continue;
                    } else if (input1 == 2) {
                        break;
                    }
                    break;
            }
        }
    }
}

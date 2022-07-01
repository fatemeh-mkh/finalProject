import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InvalidInputException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("--WELCOME TO SYSTEM--\n1:Samaneye SabtAhval va SabtAsnad(Admin Panel\n2:Samaneye Bank\n3:Day Counter\n4:Save Information\n5:Senario");
        int getnum=input.nextInt();
        if(getnum==1) {
            AdminPanel s = new AdminPanel();
            s.panelAdmin();
        }
        else if (getnum==2) {
            BankUserPanel x=new BankUserPanel();
            x.BankUserPanel();
        }
        else if (getnum==3) {

        } else if (getnum==4) {
            ModiriatBank.writeBanklistOnFile();
            ModiriatBank.writeChequeListOnFile();
            ModiriatBank.writeLoanListOnFile();
            ModiriatSabtAsnad.writeMelklistOnFile();
            ModiriatSabtAhval.writeSabtAhvallistOnFile();
        }
        else if (getnum==5) {
            System.out.println("please enter your Account and Id Number");

        }
    }
}

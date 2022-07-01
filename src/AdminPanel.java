import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.Scanner;
public class AdminPanel {
    public void panelAdmin() throws IOException {
        System.out.println("---WELCOME TO SYSTEM---\n\n[Please choose your desired option(1/2/3)]\n1:SamaneyeSabtAsnad\n2:SamaneyeSabtAhval\n");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch (i) {
            case 1:
                while (true) {
                    switch (i) {
                        case 1:
                            System.out.println("Welcome to SabtAsnad System\n1:Add Melk\n2:Change Information\n3:Remove Melk\n4:Recovery Information\n5:Exist");
                            int j = input.nextInt();
                            switch (j) {
                                case 1:
                                    while (true) {
                                        PanelSabtAsnad x = new PanelSabtAsnad();
                                        x.addMelkList();
                                        System.out.println("Is there any Melk to add more?\n1:Yes\n2:No");
                                        int input1 = input.nextInt();
                                        if (input1 == 1) {
                                            continue;
                                        } else if (input1 == 2) {
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    while (true) {
                                        PanelSabtAsnad y = new PanelSabtAsnad();
                                        y.changeInformation();
                                        System.out.println("Is there any Request to do more?\n1:Yes\n2:No");
                                        int input1 = input.nextInt();
                                        if (input1 == 1) {
                                            continue;
                                        } else if (input1 == 2) {
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    while (true) {
                                        PanelSabtAsnad n = new PanelSabtAsnad();
                                        n.removeMelk();
                                        System.out.println("Do you want to remove someone any Melk more from the list??\n1:Yes\n2:No");
                                        int input1 = input.nextInt();
                                        if (input1 == 1) {
                                            continue;
                                        } else if (input1 == 2) {
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    ModiriatSabtAsnad.writeMelklistOnFile();
                                    break;
                                case 5:
                                    while (true) {
                                        break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            case 2:
                System.out.println("Welcome to SabtAhval System\n1:Add users\n2:Change Information\n3:Remove Information\n4:Recovery Information\n4:Exist");
                int j = input.nextInt();
                switch (j) {
                    case 1:
                        while (true) {
                            PanelSabtAhval x = new PanelSabtAhval();
                            x.addUserList();
                            System.out.println("Is there any User to add more?\n1:Yes\n2:No");
                            int input1 = input.nextInt();
                            if (input1 == 1) {
                                continue;
                            } else if (input1 == 2) {
                                break;
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            PanelSabtAhval x = new PanelSabtAhval();
                            x.changeInformation();
                            System.out.println("Is there any Request to do more?\n1:Yes\n2:No");
                            int input1 = input.nextInt();
                            if (input1 == 1) {
                                continue;
                            } else if (input1 == 2) {
                                break;
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            PanelSabtAhval n = new PanelSabtAhval();
                            n.removePerson();
                            System.out.println("Do you want to remove someone else from the list??\n1:Yes\n2:No");
                            int input1 = input.nextInt();
                            if (input1 == 1) {
                                continue;
                            } else if (input1 == 2) {
                                break;
                            }
                        }
                        break;
                    case 4:
                        ModiriatSabtAhval.readSabtAhvallistOnFile();
                        break;
                    default:
                        System.out.println("Default ");
                }
                break;
            case 3:
                while (true){
                    BankPanel b= new BankPanel();
                    b.PayInstallmentsBanklist();
                    break;
                }
        }
    }
}

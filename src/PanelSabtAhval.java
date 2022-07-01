import java.io.FileNotFoundException;
import java.util.Scanner;
public class PanelSabtAhval{
    static Scanner input = new Scanner(System.in);
    public void addUserList() throws FileNotFoundException {
        System.out.println("---Please enter  name, idNumber, age,gender and wallet---");
        String name=input.next();
        String idNumber=input.next();
        int age=input.nextInt();
        String gender=input.next();
        double wallet=100;
        ModiriatSabtAhval.addUserList(name,idNumber,age,gender,wallet);
        System.out.println("list of Users:\n"+ModiriatSabtAhval.PersonInfoList.toString());
        ModiriatSabtAhval.savePersonInfo();
    }
    public void changeInformation(){
        System.out.println("Information can be changed are age and Id Number\nfor changing age press 1...\nfor changing Id Number press 2...\nfor else press 3...");

        int input2=input.nextInt();
        switch (input2){
            case 1:
                System.out.println("[Please enter exact age you want to change]\nAge:");
                int getAge=input.nextInt();
                ModiriatSabtAhval.changeAge(getAge);
                System.out.println("list of Users:\n"+ModiriatSabtAhval.PersonInfoList.toString());
                break;
            case 2:
                System.out.println("[Please enter exact Id Number you want to change]\nId Number:");
                long getId=input.nextLong();
                ModiriatSabtAhval.changeIdNumber(getId);
                System.out.println("list of Users:\n"+ModiriatSabtAhval.PersonInfoList.toString());
                break;
        }
    }
    public void removePerson(){
        System.out.println("((Choose from the list below the number of the person you want to remove from the system))");
        System.out.println("list of Users in SabtAhval System :\n"+ModiriatSabtAhval.PersonInfoList.toString());
        int input3=input.nextInt();
        ModiriatSabtAhval.removePerson(input3);
        System.out.println("list of Users in SabtAhval System :\n"+ModiriatSabtAhval.PersonInfoList.toString());
    }
}
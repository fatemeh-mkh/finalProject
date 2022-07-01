import java.util.Scanner;
public class PanelSabtAsnad {
    static Scanner input = new Scanner(System.in);
    public void addMelkList(){
        System.out.println("---Please enter registration Code, owner Id Code,property Address, date Of Buy and Value---");
        long registrationCode=input.nextLong() ;
        long ownerIdCode=input.nextLong();
        String propertyAddress=input.next();
        String dateOfBuy=input.next();
        String value=input.next();
        ModiriatSabtAsnad.addMelkInfo( registrationCode,ownerIdCode, propertyAddress,dateOfBuy,value);
        System.out.println("list of Melks:\n"+ModiriatSabtAsnad.melkInfoList.toString());
    }
    public void changeInformation(){
        System.out.println("Information can be changed are registration Code and owner IdCode and property Address\n");
        System.out.println("[Please enter exact registration Code you want to change]\nregistration Code:");
        int registrationCode=input.nextInt();
        System.out.println("[Please enter exact owner IdCode you want to change]\nId Number:");
        long IdCode=input.nextInt();
        System.out.println("[Please enter exact owner property Address you want to change]\nId Number:");
        long propertyAddress=input.nextLong();
        ModiriatSabtAsnad.changeInfoMelk( registrationCode,IdCode, String.valueOf(propertyAddress));
        System.out.println("list of Users:\n"+ModiriatSabtAsnad.melkInfoList.toString());
    }
    public void removeMelk(){
        System.out.println("((Choose number from list for delete Melk ))");
        System.out.println("list of Users in SabtAhval System :\n"+ModiriatSabtAsnad.melkInfoList.toString());
        int input3=input.nextInt();
        ModiriatSabtAsnad.removeMelk(input3);
        System.out.println("list of Users in SabtAhval System :\n"+ModiriatSabtAsnad.melkInfoList.toString());
    }
}

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class ModiriatSabtAsnad {
    public static ArrayList<EtelaatShakhs> PersonInfoList = new ArrayList<>(); ///--->list of shakhs
    public static ArrayList<Melk> melkInfoList = new ArrayList<>();//--->list of melk

    ////********************************************************************
    public static void addMelkInfo(long registrationCode, long ownerId, String propertyAddress, String dateOfBuy, String value) {//add Users
        melkInfoList.add(new Melk(registrationCode, ownerId, propertyAddress, dateOfBuy, value));
    }

    public static void changeInfoMelk(long registrationCode, long ownerId, String propertyAddress) {
        for (int i = 0; i <= melkInfoList.size(); i++) {
            melkInfoList.get(i).setRegistrationCode(registrationCode);
            melkInfoList.get(i).setOwnerId(ownerId);
            melkInfoList.get(i).setPropertyAddress(propertyAddress);
        }
    }
    public static void removeMelk(int i) {
        melkInfoList.remove(i);
    }
    public static void writeMelklistOnFile() {
        File filename = new File("C:\\Users\\KCC\\Desktop\\MelkList.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i <= ModiriatSabtAsnad.melkInfoList.size() - 1; i++) {
                output.write(ModiriatSabtAsnad.melkInfoList.get(i).toString() + "\n");
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "that file cannot create.");
        }
    }
    public static void readSabtAsnadlistOnFile() {
        ArrayList list5=new ArrayList();
        String filename = "C:\\Users\\KCC\\Desktop\\MelkList.txt";
        String line;
        try {
            BufferedReader input1=new BufferedReader(new FileReader((filename)));
            if(!input1.ready()){
                throw new IOException();
            }
            while (( line=input1.readLine())!=null){
                list5.add(line);
            }
            input1.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0; i<=list5.size();i++){
            System.out.println(list5.toString());
        }
    }
}
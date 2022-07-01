import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import static java.lang.System.in;
public class ModiriatSabtAhval {
    public static ArrayList<EtelaatShakhs> PersonInfoList = new ArrayList<>(); ///--->list of shakhs

    //*****************************************************************
    public static void addUserList(String name, String  idNumber, int age, String gender,double wallet) {
        PersonInfoList.add(new EtelaatShakhs(name, idNumber, age, gender,wallet));
    }
    public static boolean changeIdNumber(long idNumber) {
        boolean find = false;
        for (int i = 0; i <= PersonInfoList.size(); i++) {
            PersonInfoList.get(i).setIdNumber(String.valueOf(idNumber));
            find = true;
            break;
        }
        return find;
    }

    public static boolean changeAge(int age) {
        boolean find = false;
        for (int i = 0; i <= PersonInfoList.size(); i++) {
            PersonInfoList.get(i).setAge(age);
            find = true;
            break;
        }
        return find;
    }
    public static void removePerson(int input3) {
        PersonInfoList.remove(input3);
    }
    ///*******************************---------------------------------------------------------------------------------
    public static void savePersonInfo() throws FileNotFoundException {
        File f = new File("C:\\Users\\KCC\\Desktop\\FILESOFPRO");
        File f2 = new File(f, "fileProject.txt");
        Formatter out = new Formatter(f2);
        for (int i = 0; i < ModiriatSabtAhval.PersonInfoList.size(); i++) {
            out.format("%s %s %s %s %d \n", ModiriatSabtAhval.PersonInfoList.get(i).name, ModiriatSabtAhval.PersonInfoList.get(i).idNumber, ModiriatSabtAhval.PersonInfoList.get(i).age, ModiriatSabtAhval.PersonInfoList.get(i).gender,ModiriatSabtAhval.PersonInfoList.get(i).wallet);
        }
        out.flush();
        out.close();
    }
    public static void changePersonInfo() throws FileNotFoundException {
        File f = new File("C:\\Users\\KCC\\Desktop\\fileProject");
        File f2 = new File(f, "fileProject.txt");
        Formatter out = new Formatter(f2);
        for (int i = 0; i < ModiriatSabtAsnad.PersonInfoList.size(); i++) {
            out.format("%d %s \n", ModiriatSabtAsnad.PersonInfoList.get(i).name, ModiriatSabtAsnad.PersonInfoList.get(i).age, ModiriatSabtAsnad.PersonInfoList.get(i).gender, ModiriatSabtAsnad.PersonInfoList.get(i).idNumber);
        }
        out.flush();
        out.close();
    }
    public static void recoveryInfo() throws IOException {
        File f = new File(".\\files");
        File f2 = new File(f, "test.txt");
        for (int i = 0; i < ModiriatSabtAsnad.PersonInfoList.size(); i++) {
            System.out.println();
        }
        in.close();
    }

    public static void writeSabtAhvallistOnFile() {
        File filename = new File("C:\\Users\\KCC\\Desktop\\SabtAhvalList.txt");
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            for (int i = 0; i < ModiriatSabtAhval.PersonInfoList.size(); i++) {
                output.write(ModiriatBank.PersonInfoList.get(i).toString() + "\n");
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "that file cannot create.");
        }
    }
    public static void readSabtAhvallistOnFile() {
        ArrayList list4=new ArrayList();
        String filename = "C:\\Users\\KCC\\Desktop\\SabtAhvalList.txt";
        String line;
        try {
            BufferedReader input1=new BufferedReader(new FileReader((filename)));
            if(!input1.ready()){
                throw new IOException();
            }
            while (( line=input1.readLine())!=null){
                list4.add(line);
            }
            input1.close();
        }catch (IOException e){
            System.out.println(e);
        }
        for (int i=0; i<=list4.size();i++){
            System.out.println(list4.toString());
        }
    }
}
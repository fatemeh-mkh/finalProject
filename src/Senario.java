public class Senario {
    public static void Senario(String accountNumber,String accountNumber2, String idNumber) {
        ModiriatSabtAhval.readSabtAhvallistOnFile();
        for(int i=0 ; i<=ModiriatSabtAhval.PersonInfoList.size();i++){
            if (ModiriatSabtAhval.PersonInfoList.get(i).idNumber.equals(idNumber) || ModiriatBank.hesabSepordeList.get(i).accountNumber.equals(accountNumber2)) {
                ModiriatSabtAhval.PersonInfoList.get(i).wallet=0;
            }
            ModiriatBank.readHesabBankiListOnFile();
            for( i=0 ; i<=ModiriatBank.hesabBankiList.size();i++){
                if (ModiriatBank.hesabBankiList.get(i).accountNumber.equals(accountNumber) || ModiriatBank.hesabSepordeList.get(i).accountNumber.equals(accountNumber2)) {
                    if(ModiriatSabtAhval.PersonInfoList.get(i).idNumber.equals(idNumber))
                        ModiriatBank.hesabBankiList.get(i).inventory=ModiriatSabtAhval.PersonInfoList.get(i).wallet + ModiriatBank.hesabBankiList.get(i).inventory;
                }
            }
            System.out.println("Bank list Senario:"+ModiriatBank.hesabBankiList);
        }
    }
}

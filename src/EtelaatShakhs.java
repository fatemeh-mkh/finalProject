public class EtelaatShakhs {
    String name;
    String idNumber;
    int age;
    String gender ;
    double wallet ;

    @Override
    public String toString() {
        return "EtelaatShakhs{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", wallet=" + wallet +"\n"+
                '}';
    }

    public EtelaatShakhs(String name, String  idNumber, int age, String gender, double wallet) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.gender = gender;
        this.wallet = 100;
    }

    public String  getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String  idNumber) {
        this.idNumber = idNumber;
    }
    public int getAge(int age) {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}

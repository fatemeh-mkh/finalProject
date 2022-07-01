public class Melk {
    long registrationCode ;
    long ownerId ;
    String propertyAddress;
    String dateOfBuy ;
    String value;
    public Melk(long registrationCode, long ownerId, String propertyAddress, String dateOfBuy, String value) {
        this.registrationCode = registrationCode;
        this.ownerId = ownerId;
        this.propertyAddress = propertyAddress;
        this.dateOfBuy = dateOfBuy;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Melk{" +
                "registrationCode=" + registrationCode +
                ", ownerId=" + ownerId +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", dateOfBuy='" + dateOfBuy + '\'' +
                ", value='" + value + '\'' +"\n"+
                '}';
    }
    public long getRegistrationCode() {
        return registrationCode;
    }
    public void setRegistrationCode(long registrationCode) {
        this.registrationCode = registrationCode;
    }

    public long getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getDateOfBuy() {
        return dateOfBuy;
    }

    public void setDateOfBuy(String dateOfBuy) {
        this.dateOfBuy = dateOfBuy;
    }
}

public abstract class Vehicle {
    private String licensePlate;
    private String stateAbbr;
    private String phoneNum;

    public Vehicle(){}

    public Vehicle(String stateAbbr, String licensePlate, String phoneNum){
        this.licensePlate = licensePlate;
        this.stateAbbr = stateAbbr;
        this.phoneNum = phoneNum;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

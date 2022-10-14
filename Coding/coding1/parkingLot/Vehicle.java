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
}

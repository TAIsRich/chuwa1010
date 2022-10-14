public class Truck extends Vehicle{
    private String type;

    public Truck(){};

    public Truck(String type, String stateAbbr, String licensePlate, String phoneNum){
        super(licensePlate, stateAbbr, phoneNum);
        this.type = type;
    }
    //TODO: write getters
    //TODO: write setters
}

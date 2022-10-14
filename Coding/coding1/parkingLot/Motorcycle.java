public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(){};

    public Motorcycle(String type, String stateAbbr, String licensePlate, String phoneNum){
        super(licensePlate, stateAbbr, phoneNum);
        this.type = type;
    }
    //TODO: write getters
    //TODO: write setters
}

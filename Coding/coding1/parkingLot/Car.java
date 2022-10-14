public class Car extends Vehicle{
    private String type;

    public Car(){};

    public Car(String type, String stateAbbr, String licensePlate, String phoneNum){
        super(licensePlate, stateAbbr, phoneNum);
        this.type = type;
    }

    //TODO: write getters
    //TODO: write setters
}

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(){};

    public Motorcycle(String type, String stateAbbr, String licensePlate, String phoneNum){
        super(licensePlate, stateAbbr, phoneNum);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

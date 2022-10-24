public class Car extends Vehicle{
    private String type;//Sedan, SUV, Convertible, etc.

    public Car(){};

    public Car(String type, String stateAbbr, String licensePlate, String phoneNum){
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

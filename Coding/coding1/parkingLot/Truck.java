public class Truck extends Vehicle{
    private String type;//Van, pick-up, semi-trailer,etc.
    private double weightLB;

    public Truck(){};

    public Truck(String type, double weightLB, String stateAbbr, String licensePlate, String phoneNum){
        super(licensePlate, stateAbbr, phoneNum);
        this.type = type;
        this.weightLB = weightLB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightLB() {
        return weightLB;
    }

    public void setWeightLB(double weightLB) {
        this.weightLB = weightLB;
    }
}

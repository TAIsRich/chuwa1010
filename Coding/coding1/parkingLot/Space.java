import java.time.Duration;
import java.time.LocalDateTime;

public class Space {
    private int spaceNum;
    private Vehicle vehicle;
    private double ratePerHr;
    private boolean isOccupied;
    private LocalDateTime startTime;

    public Space(){}

    public Space(int spaceNum){
        this.spaceNum = spaceNum;
    }

    public int getSpaceNum() {
        return spaceNum;
    }

    public void setSpaceNum(int spaceNum) {
        this.spaceNum = spaceNum;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getRatePerHr() {
        return ratePerHr;
    }

    public void setRatePerHr(double ratePerHr) {
        this.ratePerHr = ratePerHr;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
        if(vehicle instanceof Car){
            ratePerHr = 10;
        }else if (vehicle instanceof Truck){
            ratePerHr = 15;
        }else if (vehicle instanceof Motorcycle){
            ratePerHr = 8;
        }else{
            throw new RuntimeException("Vehicle Class not defined!");
        }
        this.isOccupied = true;
        this.startTime = LocalDateTime.now();
    }

    public double checkout(){

        //TODO: awaiting to complete charge calculation
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        double hours = (double) duration.toHours();
        double charge = hours * ratePerHr;
        System.out.println(charge);
        this.vehicle = null;
        this.ratePerHr = 0;
        this.isOccupied = false;
        this.startTime = null;

        return charge;
    }
}

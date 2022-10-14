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

    //TODO: write getters
    //TODO: write setters

    public void park(Vehicle vehicle){
        //list more rate
        this.vehicle = vehicle;
        if(vehicle instanceof Car){
            ratePerHr = 10;
        }else if (vehicle instanceof Truck){
            ratePerHr = 15;
        }else if (vehicle instanceof Motorcycle){
            ratePerHr = 8;
        }else{
            throw new RuntimeException("Vehicle Class does not exist!");
        }
        isOccupied = true;
        startTime = LocalDateTime.now();
    }

    public double checkout(){

        //TODO: awaiting to complete charge calculation
        LocalDateTime endTime = LocalDateTime.now();
        double charge = 0;
        System.out.println(charge);
        this.vehicle = null;
        this.ratePerHr = 0;
        this.isOccupied = false;

        return charge;
    }
}

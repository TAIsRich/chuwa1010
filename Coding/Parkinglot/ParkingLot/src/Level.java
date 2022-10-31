public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;

    // max 10 spots in one row
    private static final int SPOT_PER_ROW = 20;

    public Level (int flr, int numSpots){
        floor = flr;
        availableSpots = numSpots;
        spots = new ParkingSpot[numSpots];
        // define spots for each type of vehicle
        int LargeSpots = numSpots / 4;
        int CompactSpots = numSpots / 4;
        int MotorcycleSpots = numSpots - LargeSpots - CompactSpots;

        // Define the rule of parking
        for (int i = 0; i < numSpots; i++){
            VehicleSize size = VehicleSize.Motorcycle;
            if (i < LargeSpots ){
                 size = VehicleSize.Large;
            }
            else if (i < LargeSpots + CompactSpots){
                 size = VehicleSize.Compact;
            }
            int row = i/ SPOT_PER_ROW;
            spots [i] = new ParkingSpot(this,row,i,size);
        }
    }

    public int availableSpots(){
        return availableSpots;
    }

    public boolean parkVehicle (Vehicle vehicle){
        if (availableSpots() < vehicle.getSpotsNeed()) return false;

        int spotNumber = finAvailableSpots(vehicle);
        if (spotNumber < 0) return false;

        return parkStartingAtSpot (spotNumber, vehicle);
    }

    private boolean parkStartingAtSpot(int num, Vehicle vehicle){
        vehicle.clearSpot();
        boolean success = true;
        for (int i=0; i<num+vehicle.spotsNeed;i++){
            success &= spots[i].park(vehicle);
        }
        availableSpots = availableSpots - vehicle.spotsNeed;
        return success;
    }

    private int finAvailableSpots(Vehicle vehicle){
        int spotsNeed = vehicle.spotsNeed;
        int lastRow = -1;
        int spotsFound = 0;

        for (int j=0; j<spots.length; j++){
            ParkingSpot spot = spots[j];
            if (lastRow != spots[j].getLane()){
                spotsFound = 0;
                lastRow = spots[j].getLane();
            }
            if (spots[j].canFitVehicle(vehicle)){
                spotsFound = spotsFound + 1;
            }
            else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeed){
                if (vehicle.size == VehicleSize.Large){
                    System.out.print("It is a Large Car parked in ");
                }
                else if (vehicle.size == VehicleSize.Compact){
                    System.out.print("It is a Compact Car parked in ");
                }
                else {
                    System.out.print("It is a Motorcycle parked in ");
                }
                System.out.print("Lane Number " + lastRow + '\n');
                return j - (spotsNeed -1);
            }
        }
        return -1;
    }

    // Vehicle leaves the parking lot, available num + 1
    public void slotFreed(){
        availableSpots = availableSpots + 1;
        System.out.print("Available Spots in the current level:" + availableSpots + '\n');
    }
}



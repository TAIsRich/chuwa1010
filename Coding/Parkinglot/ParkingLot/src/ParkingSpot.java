public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize size;
    private int lane;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level l, int r, int num, VehicleSize vs){
        level = l;
        lane = r;
        spotNumber = num;
        size = vs;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return isAvailable() && vehicle.canFitSpot(this);
    }

    public boolean park(Vehicle vehicleObject){
        if (!canFitVehicle(vehicleObject)){
            return false;
        }

        vehicle = vehicleObject;
        vehicle.parkInSpot(this);
        return true;
    }

    public int getLane(){
        return  lane;
    }

    public int getSpotNumber(){
        return  spotNumber;
    }

    public VehicleSize getSize(){
        return size;
    }

    public void removeVehicle(){
        level.slotFreed();
        vehicle = null;
    }
}

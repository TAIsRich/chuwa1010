public class Compact  extends Vehicle{
    public Compact(String licensePlate){
        spotsNeed = 1;
        size = VehicleSize.Compact;
        this.licensePlate = licensePlate;
    }

    public boolean canFitSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Compact || spot.getSize() == VehicleSize.Large;
    }
}

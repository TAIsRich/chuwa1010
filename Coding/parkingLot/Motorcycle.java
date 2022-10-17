public class Motorcycle extends Vehicle{
    public Motorcycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }
    public boolean canFitInSpot(parkingSpot spot){
        return spot.getSize() == VehicleSize.Large || spot.getSize() == Vehicle.Compact || spot.getSize() == VehicleSize.Motorcycle;
    }
}
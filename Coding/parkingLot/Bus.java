public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitInSpot(parkingSpoot spot){
        return spot.getSize() == VehicleSize.large;
    }
}
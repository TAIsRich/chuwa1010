public class Car extends Vehicle{
    public Car(){
        spotNeeded = 1;
        size = VehicleSize.Compact;
    }
    public boolean canFitInSpot(parkinggSpot spot){
        return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact;
    }
}
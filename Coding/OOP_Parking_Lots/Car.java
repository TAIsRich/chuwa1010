// reference: https://github.com/apriljdai/CC150/blob/master/Object-Oriented%20Design/ParkingLot.java

public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    public boolean canFitInSpot(parkingSpot spot){
        //checks if the spot is a compact or a large
        return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact;
    }
}
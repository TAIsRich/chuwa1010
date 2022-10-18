// reference: https://github.com/apriljdai/CC150/blob/master/Object-Oriented%20Design/ParkingLot.java

public class Motorcycle extends Vehicle{
    public Motorcycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitInSpot(parkingSpot spot){
        //checks if the spot is a compact, motorcycle or a large
        return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact || spot.getSize() == VehicleSize.Motorcycle;
    }
}
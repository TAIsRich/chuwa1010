// reference: https://github.com/apriljdai/CC150/blob/master/Object-Oriented%20Design/ParkingLot.java

public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitInSpot(ParkingSpot spot){
        //checks if the spot is a Large, does NOT check num of spots
        return spot.getSize() == VehicleSize.Large;
    }
}
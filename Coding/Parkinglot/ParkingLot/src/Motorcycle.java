public class Motorcycle extends Vehicle{

    public Motorcycle(String licensePlate){
        spotsNeed = 1;
        size = VehicleSize.Motorcycle;
        this.licensePlate = licensePlate;
    }

    public boolean canFitSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Motorcycle || spot.getSize() == VehicleSize.Compact || spot.getSize() == VehicleSize.Large;
    }
}

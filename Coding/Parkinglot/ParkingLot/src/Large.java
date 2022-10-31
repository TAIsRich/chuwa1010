public class Large extends Vehicle{
    public Large(String licensePlate){
        spotsNeed = 1;
        size = VehicleSize.Compact;
        this.licensePlate = licensePlate;
    }

    public boolean canFitSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Large;
    }
}

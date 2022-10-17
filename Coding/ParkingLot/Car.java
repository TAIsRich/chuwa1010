public class Car extends Vehicle{
    public Car(String licensePlate){
        spotsNeeded = 1;
        size = VehicleSize.CarSize;
        this.licensePlate = licensePlate;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.CarSize;
    }
}

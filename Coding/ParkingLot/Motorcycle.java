public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate) {
        spotsNeeded = 1;
        size = VehicleSize.MotorcycleSize;
        this.licensePlate = licensePlate;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }
}

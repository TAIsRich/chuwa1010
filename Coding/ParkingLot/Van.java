package ParkingLot;

public class Van extends Vehicle {
    @Override
    public VehicleSize getCarSize() {
        return VehicleSize.REGULAR;
    }
}
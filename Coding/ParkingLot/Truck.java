package ParkingLot;

public class Truck extends Vehicle {
    @Override
    public VehicleSize getCarSize() {
        return VehicleSize.LARGE;
    }
}
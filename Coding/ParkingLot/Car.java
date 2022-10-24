package ParkingLot;

public class Car extends Vehicle {
    @Override
    public VehicleSize getCarSize() {
        return VehicleSize.COMPACT;
    }
}
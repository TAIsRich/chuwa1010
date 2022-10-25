package ParkingLot;

public class Car extends Vehicle{

    public Car(String licensePlate){
        slotsNeeded=1;
        vehicleSize=VehicleSize.CarSize;
        this.licensePlate=licensePlate;
    }
    @Override
    public boolean canFitInSlot(ParkingSlot spot) {
        return spot.getSize()== VehicleSize.CarSize;
    }
}

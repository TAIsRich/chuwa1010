package ParkingLot;

public class Motor extends Vehicle {
    public Motor(String licensePlate){
        slotsNeeded=1;
        vehicleSize=VehicleSize.Motocycle;
        this.licensePlate=licensePlate;
    }


    @Override
    public boolean canFitInSlot(ParkingSlot slot) {

        //check if the slot
        return slot.getSize() == VehicleSize.Motocycle;
    }
}

package ParkingLot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSlot> parkingSlots = new ArrayList<ParkingSlot>();
    protected int slotsNeeded;
    protected String licensePlate;
    protected VehicleSize vehicleSize;
    //space a vehicle need
    public int getSpotsNeeded(){
        return  slotsNeeded;
    }

    //size of vehicle
    public VehicleSize getSize(){
        return vehicleSize;
    }
    //remove vehicle from slot
    public void clearSlot(){
        for(int i =0; i<parkingSlots.size();i++){
            parkingSlots.get(i).removeVehicle();
        }
        parkingSlots.clear();
    }
    // an abstract method that has to be defined by the child classess
    public abstract boolean canFitInSlot(ParkingSlot spot);
}



package org.example;

import java.util.ArrayList;

public abstract class Vehicle {
    // list of adding the slots that has been filled
    protected  ArrayList<ParkingSlot> parkingSlots = new ArrayList<ParkingSlot>();
    // licence plate of the vehicle
    protected String licPlate;
    // field for the slot required by a vehicle
    protected int slotsNeeded;
    // size of the vehicle which is determined by the type of the vehicle
    protected  VSize siz;

    protected  String companyName;

    public int getSlotsNeeded(){
        return slotsNeeded;
    }

    //the method adds the filled slot to the parkingSlots list
    public void parkInSlot(ParkingSlot s){
        parkingSlots.add(s);
    }

    //get the size of vehicle
    public VSize getSize(){
        return siz;
    }

    public void clearSlots(){
        for(int i=0; i< parkingSlots.size();i++){
            parkingSlots.get(i).removeVehicle();
        }
        parkingSlots.clear();
    }

    //an abstract method that has to be defined by the child classes
    public abstract boolean canFitInSlot(ParkingSlot spot);
}

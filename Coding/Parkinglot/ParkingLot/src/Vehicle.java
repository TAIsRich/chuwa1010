import java.util.*;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingspots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeed;
    protected VehicleSize size;

    public int getSpotsNeed(){
        return spotsNeed;
    }

    public VehicleSize getSize(){
        return size;
    }

    // park car in the spot
    public void parkInSpot(ParkingSpot s){
        parkingspots.add(s);
    }

    // clear the parking lot
    public void clearSpot(){
        for (int i = 0; i< parkingspots.size(); i++){
            parkingspots.get(i).removeVehicle();
        }
        parkingspots.clear();
    }

    public abstract boolean canFitSpot (ParkingSpot spot);
}

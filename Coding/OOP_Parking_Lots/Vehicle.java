// reference: https://github.com/apriljdai/CC150/blob/master/Object-Oriented%20Design/ParkingLot.java

public abstract class Vehicle{
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded(){
        return spotsNeeded;
    }
    public VehicleSize getSize(){
        return size;
    }

    public void parkInSpot(parkingSpot s){
        parkingSpots.add(s);
    }

    public void clearSpots(){
        //remove car from spot, and notify spot that it's gone
        for (int i = 0; i < parkingSpots.size(); i++){
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}
public abstract class Vehicle{
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded(){
        return spotsNeeded;
    }

    public VeicleSize getSize(){
        return size;
    }

    public void parkInspot(parkingSpot s){
        parkingSpots.add(s);
    }

    public clearSpots(){
        for (int i = 0; i < parkingSpots.size(); i++){
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(parkingSpot spot);
}
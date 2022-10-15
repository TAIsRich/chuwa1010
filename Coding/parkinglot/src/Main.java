public enum VehicleSize{
    Motorcycle, Compact, Large,
}

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
        for (int i = 0; i < parkingSpots.size(); i++){
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}

public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitInSpot(ParkingSpot spot){
        return spot.getSize() == VehicleSize.Large;
    }
}

public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    public boolean canFitInSpot(parkingSpot spot){
        return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact;
    }
}

public class Motorcycle extends Vehicle{
    public Motorcycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitInSpot(parkingSpot spot){
        return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact || spot.getSize() == VehicleSize.Motorcycle;
    }
}

public class ParkingLot{
    private Level[] levels;
    private final int NUM_LEVELS = 5;

    public ParkingLot(){
        levels = new Level[NUM_LEVELS];
        for (int i = 0; i < NUM_LEVELS; i++){
            levels[i] = new Level(i, 30);
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for (int i = 0; i < levels.length; i++){
            if (levels[i].parkVehicle(vehicle))
                return true;
        }
        return false;
    }
}


public class Level{
    private int floor;
    private ParkingSpot[] spots;	//number of spots in each level, including large, compact and motorcycle size
    private int availableSpots = 0;	//number of free spots
    private static final int SPOT_PER_ROW = 10;

    public Level(int flr, int numberSpots){
        floor = flr;
        availableSpots = numberSpots;
        spots = new ParkingSpot[numberSpots];

        int largeSpots = numberSpots / 4;
        int bikeSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - bikeSpots;

        for (int i = 0; i < numberSpots; i++){
            VehicleSize sz = VehicleSize.Motorcycle;
            if (i < largeSpots){
                sz = VehicleSize.Large;
            }
            else if (i < largeSpots + compactSpots){
                sz = VehicleSize.Compact;
            }
            int row = i / SPOT_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, sz);
        }
    }

    public int availableSpots(){
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle){
        //find a place to park this vehicle, return false if failed
        if (availableSpots() < vehicle.getSpotsNeeded())
            return false;

        int spotNumber = findAvailableSpots(vehicle);
        if (spotNumber < 0)
            return false;
        return parkStartingAtSpot(spotNumber, vehicle);
    }

    private boolean parkStartingAtSpot(int num, Vehicle v){
        //park a vehicle starting at the spot spotNumber, and continuing until vehicle.spotsNeeded
        vehicle.clearSpots();
        boolean success = true;
        for (int i = num; i < num + vehicle.spotsNeeded; i++){
            success &= spots[i].park(vehicle);
        }
        availableSpots -= vehicle.spotsNeeded;
        return success;
    }

    private int findAvailableSpots(Vehicle vehicle){
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;

        for (int i = 0; i < spots.length; i++){
            ParkingSpot spot = spots[i];
            if (lastRow != spots.getRow()){
                spotsFound = 0;
                lastRow = spots.getRow();
            }
            if (spots.canFitVehicle(vehicle)){
                spotsFound++;
            }
            else{
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded){
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    public void spotFreed(){
        availableSpots++;
    }
}

public class ParkingSpot{
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, VehicleSize s){
        level = lvl;
        row = r;
        spotNumber = n;
        spotSize = s;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    public boolean park(Vehicle v){
        if (!canFitVehicle(v))
            return false;

        vehicle = v;
        vehicle.parkInSpot(this);
        return true;
    }

    public int getRow(){
        return row;
    }
    public int getSpotNumber(){
        return spotNumber;
    }
    public VehicleSize getSize(){
        return spotSize;
    }

    public void removeVehicle(){
        level.spotFreed();
        vehicle = null;
    }
}
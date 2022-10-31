

public class ParkingLot {
    private Level[] levels;
    private final int NUM_LEVEL = 5;
    private int numberSpots;

    // create parking lot
    public ParkingLot(int numberSpots){
        this.numberSpots = numberSpots;
        levels = new Level[NUM_LEVEL];
        for (int j = 0; j < NUM_LEVEL; j++){
            levels[j] = new Level(j, numberSpots);
            System.out.print("Level "+ j + " created with "+
             numberSpots + " spots\n");
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for (int i =0; i < NUM_LEVEL; i++){
            if (levels[i].parkVehicle(vehicle)){
                System.out.print("Level "+ i + " with Vehicle Number "+
                        vehicle.licensePlate + '\n');
                return true;
            }
        }
        System.out.print("Parking is full \n");
        return false;
    }

    public void leave(Vehicle vehicle, int level){
        levels[level].slotFreed();
        System.out.print("Spot freed from Level "+ level+
                " and exited "+ vehicle.licensePlate+ '\n');
    }
}

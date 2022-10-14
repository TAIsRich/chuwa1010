public class ParkingLot {
    private Level[] levels;
    private final int NUM_LEVELS = 2;
    private int numberSpots;

    public ParkingLot(int numberSpots) {
        this.numberSpots = numberSpots;
        levels = new Level[NUM_LEVELS];
        for (int i = 0; i < NUM_LEVELS; i++) {
            levels[i] = new Level(i, numberSpots);
            System.out.println("Level " + i + " created with " + numberSpots + " spots");
        }
    }

    public boolean parkVehicle(Vehicle vh) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].parkVehicle(vh)) {
                System.out.println(" Level "+i+", Vehicle Licence Plate: "+ vh.licensePlate);
                return true;
            }
        }
        System.out.println("**************************************************");
        System.out.println("Parking Lot is Full");
        return false;
    }

    public void leave(Vehicle vh, int lvl) {
        levels[lvl].spotFree();
        System.out.println("--------------------------------------------------");
        System.out.println("One Vehicle Exited. "+ "One spot free from Level "+ lvl );
        vh.clearSpots();
    }

}


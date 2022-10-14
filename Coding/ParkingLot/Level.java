public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 20;

    public Level(int flr, int numberSpots){
        floor = flr;
        availableSpots = numberSpots;
        spots = new ParkingSpot[numberSpots];
        int bikeSpots = numberSpots / 10;
        int carSpots = numberSpots - bikeSpots;
        for (int i = 0; i < numberSpots; i++) {
            VehicleSize siz = VehicleSize.MotorcycleSize;
            if (i < carSpots){
                siz = VehicleSize.CarSize;
            }
            int row = i / SPOTS_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, siz);
        }
    }

    public int availableSpots(){
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vh){
        if (availableSpots() < vh.getSpotsNeeded()) return  false;
        int spotNumber = findAvailableSpots(vh);
        if (spotNumber < 0) return false;
        System.out.print(" Spot " + spotNumber);
        return parkStartingAtSpot(spotNumber, vh);
    }
    private int findAvailableSpots(Vehicle vh) {
        int spotsNeeded = vh.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;

        for(int i = 0; i < spots.length; i++){
            ParkingSpot spot = spots[i];
            if(lastRow != spot.getRow()){
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if(spot.canFitVehicle(vh)){
                spotsFound++;
            }else{
                spotsFound = 0;
            }

            if(spotsFound == spotsNeeded){
                System.out.println("--------------------------------------------------");

                if (vh.size == VehicleSize.CarSize) {
                    System.out.print("One Car Parked in Location: ");
                } else {
                    System.out.print("One Motorcycle Parked in Location: ");

                }
                System.out.print("Row " + lastRow);
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }
    private boolean parkStartingAtSpot(int num, Vehicle vh) {
        vh.clearSpots();

        boolean success = true;

        for (int i = num; i < num + vh.spotsNeeded; i++) {
            success &= spots[i].park(vh);
        }

        availableSpots -= vh.spotsNeeded;
        return success;
    }
    public void spotFree()
    {
        availableSpots++;
    }
}


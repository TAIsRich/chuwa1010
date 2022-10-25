package ParkingLot;

public class ParkingSlot {
    private Vehicle vehicle;
    private VehicleSize siz;
    private int row;
    private int spotNumber;

    public ParkingSlot(VehicleSize siz, int row, int spotNumber) {
        this.siz = siz;
        this.row = row;
        this.spotNumber = spotNumber;
    }

    public VehicleSize getSize() {
        return siz;
    }
    public boolean isAvailable()
    {
        return vehicle == null;
    }
    public boolean canFitVehicle(Vehicle vh)
    {
//check if the spot is big enough and is available
        return isAvailable() && vh.canFitInSlot(this);
    }


    public void removeVehicle() {
    }
    public int getRow()
    {
        return row;
    }
    public int getSpotNumber()
    {
        return spotNumber;
    }
}

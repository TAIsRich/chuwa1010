Package ParkingLot;

public enum VehicleSize{
    COMPACT(1),
    REGULAR(2),
    LARGE(3);
    private final int size;

    VehicleSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
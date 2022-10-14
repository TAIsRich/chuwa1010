
public abstract class ParkingSpot {
    private String number;
    private boolean free;
    private Vehicle vehicle;
    private final ParkingSpotType type;

    public boolean isFree() {
        return free;
    };

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
        return free;
    }

    public void removeVehicle() {
        this.vehicle = null;
        free = true;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}


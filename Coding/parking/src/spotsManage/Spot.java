package spotsManage;

import enumHold.ParkingSpotType;
import vehicleManage.Vehicle;

public abstract class Spot {
    private String number;
    private Vehicle vehicle;
    private final ParkingSpotType type;

    protected Spot(String number, ParkingSpotType type) {
        this.number = number;
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return true;
    }
}

public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }
    public void assignTicket(ParkingTicket ticket) {
    }

    public VehicleType getType() {
        return type;
    }
}

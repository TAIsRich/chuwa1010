public class Vehicle {
    protected VehicleSize vehicleSize;
    protected String licensePlate;
    protected static int totalSpot = 100;

    public Vehicle(VehicleSize vehicleSize, String licensePlate) {
        this.vehicleSize = vehicleSize;
        this.licensePlate = licensePlate;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public static int getTotalSpot() {
        return totalSpot;
    }

    public static void setTotalSpot(int totalSpot) {
        Vehicle.totalSpot = totalSpot;
    }

    public void takeSpot() {
        totalSpot--;
    }
}

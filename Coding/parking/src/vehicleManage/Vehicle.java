package vehicleManage;

import enumHold.VehicleType;

public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}


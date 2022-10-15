package ParkingLot;

import java.time.LocalTime;

public class Cars {
    public enum Type {
        SEDAN, TRUCK, ELECTRIC, VAN, MOTORBIKE
    }

    private String LicensePlate;
    private Type type;
    private LocalTime time;
    private boolean parked;

    public Cars (Type type, String LicensePlate, LocalTime time) {
        this.type = type;
        this.time = time;
        this.LicensePlate = LicensePlate;
    }


    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public boolean isParked() {
        return parked;
    }

    public void setParked(boolean parked) {
        this.parked = parked;
    }
}

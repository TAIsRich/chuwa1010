import java.util.Date;

public class Ticket {
    private int slotNumber;
    private String vehicleNumber;
    private Date date;
    private VehicleSize vehicleSize;

    public Ticket(int slotNumber, String vehicleNumber, Date date, VehicleSize vehicleSize) {
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSize= vehicleSize;
        this.date = date;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String displayTicketDetails() {
        return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", date=" + date
                + ", vehicleSize=" + vehicleSize + "]";
    }
}

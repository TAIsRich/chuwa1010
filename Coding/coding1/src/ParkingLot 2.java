
import java.util.HashMap;

public class ParkingLot {
    private String name;
    private Location address;
    private ParkingRate parkingRate;

    private int compactSpotCount;
    private int largeSpotCount;
    private int motorBikeSpotCount;
    private int electricSpotCount;
    private final int maxCompactCount;
    private  int maxLargeCount;
    private  int maxMotorbikeCount;
    private  int maxElectricCount;

    private HashMap<String, EntrancePanel> entrancePanels;
    private HashMap<String, ExitPanel> exitPanels;

    private HashMap<String, ParkingTicket> activeTickets;

    private static ParkingLot parkingLot = null;

    private ParkingLot() {
        maxCompactCount = 300;
        maxLargeCount = 200;
        maxMotorbikeCount = 20;
        maxElectricCount = 40;
    }
    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }
    public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws Exception {
        if (this.isFull(vehicle.getType())) {
            throw new Exception("Parking Lot is full");
        }
        ParkingTicket ticket = new ParkingTicket();
        vehicle.assignTicket(ticket);

        this.incrementSpotCount(vehicle.getType());
        this.activeTickets.put(ticket.getTicketNumber(), ticket);
        return ticket;
    }

    private boolean isFull(VehicleType type) {
        // trucks and vans can only be parked in LargeSpot
        if (type == VehicleType.TRUCK || type == VehicleType.VAN ) {
            return largeSpotCount >= maxLargeCount;
        }
        if (type == VehicleType.MOTORBIKE) {
            return motorBikeSpotCount >= maxMotorbikeCount;
        }
        // cars can be parked at compact or large spots
        if(type == VehicleType.CAR) {
            return (compactSpotCount + largeSpotCount) >= (maxCompactCount + maxLargeCount);
        }
        // electric car can be parked at compact, large or electric spots
        return (compactSpotCount + largeSpotCount + electricSpotCount) >= (maxElectricCount + maxLargeCount + maxCompactCount);
    }

    // increment the parking spot count based on the vehicle type
    private void incrementSpotCount(VehicleType type) {
        if (type == VehicleType.TRUCK || type == VehicleType.VAN) {
            largeSpotCount++;
        }else if (type == VehicleType.MOTORBIKE) {
            motorBikeSpotCount++;
        }else if (type == VehicleType.CAR) {
            if (compactSpotCount < maxCompactCount) {
                compactSpotCount++;;
            }else {
                largeSpotCount++;
            }
        }else {
            if (electricSpotCount < maxElectricCount) {
                electricSpotCount++;
            }else if (compactSpotCount < maxCompactCount) {
                compactSpotCount++;
            }else {
                largeSpotCount++;
            }
        }
    }
}

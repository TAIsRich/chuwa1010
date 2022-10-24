package ParkingLot;

class Level{
    private final List<ParkingSpot> spots;

    Level(int numOfSpots) {
        List<ParkingSpot> list = new ArrayList<>(numOfSpots);
        int i = 0;
        for (; i < numOfSpots / 2; i++) {
            spots.add(new ParkingSpot(VehicleSize.COMPACT));
        }
        for (; i < numOfSpots; i++) {
            spots.add(new ParkingSpot(VehicleSize.LARGE));
        }
        spots = Collections.unmodifiableList(list);
    }

    boolean hasSpot(Vehicle V) {
        for (ParkingSpot s : spots) {
            if (s.fit(v)) {
                return true;
            }
        }
        return false;
    }

    boolean park(Vehicle v) {
        for (ParkingSpot s : spots) {
            if (s.fit(v)) {
                s.park();
                return true;
            }
        }
        return false;
    }

    boolean leave(Vehicle v) {
        for (ParkingSpot s : spots) {
            if (s.getVehicle() == v) {
                s.leave();
                return true;
            }
            return false;
        }
    }

public class Lvl
{
    private int floor;
    private ParkingSlot[] slots;    // number of slots in each level, including large, compact and motorcycle size
    private int availableSlots = 0; // number of free slots

    // in each row at max there can be 10 slots
    private static final int SLOT_PER_ROW = 10;

    // constructor of the class Lvl
    public Lvl(int flr, int numberSlots)
    {
        floor = flr;
        availableSlots = numberSlots;
        slots = new ParkingSlot[numberSlots];
        int largeSlots = numberSlots / 4;
        int bikeSlots = numberSlots / 4;
        int compactSlots = numberSlots - largeSlots - bikeSlots;

        for (int j = 0; j < numberSlots; j++)
        {
            VSize siz = VSize.Motorcycle;
            if (j < largeSlots + compactSlots)
            {
                siz = VSize.CarSize;
            }
            int row = j / SLOT_PER_ROW;
            slots[j] = new ParkingSlot(this, row, j, siz);
        }
    }

    public int availableSlots()
    {
        return availableSlots;
    }

    public boolean parkVehicle(Vehicle vh)
    {
//find a place to park this vehicle, return false if failed
        if (availableSlots() < vh.getSlotsNeeded())
            return false;

        int slotNumber = findAvailableSlots(vh);
        if (slotNumber < 0)
            return false;
        System.out.print(", Slot Number " + slotNumber);
        return parkStartingAtSlot(slotNumber, vh);
    }
    private boolean parkStartingAtSlot(int num, Vehicle vh)
    {
// park a vehicle at the slot slotNumber, and continuing till vehicle.slotsNeeded
        vh.clearSlots();
        boolean success = true;
        for (int j = num; j < num + vh.slotsNeeded; j++)
        {
            success &= slots[j].park(vh);
        }
        availableSlots = availableSlots - vh.slotsNeeded;
        return success;
    }

    // a method to find the vacant slot
    private int findAvailableSlots(Vehicle vh)
    {
        int slotsNeeded = vh.getSlotsNeeded();
        int lastRow = -1;
        int slotsFound = 0;

        for (int j = 0; j < slots.length; j++)
        {
            ParkingSlot spot = slots[j];
            if (lastRow != slots[j].getLane())
            {
                slotsFound = 0;
                lastRow = slots[j].getLane();
            }
            if (slots[j].canFitVehicle(vh))
            {
                slotsFound = slotsFound + 1;
            }
            else
            {
                slotsFound = 0;
            }
            if (slotsFound == slotsNeeded)
            {
                if(vh.siz == VSize.CarSize)
                    System.out.print("It is a Car parked in ");
                else
                    System.out.print("It is a Motorcycle parked in ");
                System.out.print("Lane Number  " + lastRow);
                return j - (slotsNeeded - 1);
            }
        }
        return -1;
    }

    // when the vehicle leaves the parking lot
// the numbyer of available slot increases by 1
    public void slotFreed()
    {
        availableSlots = availableSlots + 1;
        System.out.println("Available Slots in the current level :" + availableSlots);
    }
}
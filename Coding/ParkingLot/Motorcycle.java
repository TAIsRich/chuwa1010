public class Motorcycle extends Vehicle
{
    // constructor of the class Motorcycle
    public Motorcycle(String licPlate, String companyName)
    {
        slotsNeeded = 1;
        siz = VSize.Motorcycle;
        this.licPlate = licPlate;
        this.companyName = companyName;
    }

    public boolean canFitInSlot(ParkingSlot slot)
    {
// checks if the slot is a compact, motorcycle or a large

        return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle;
    }
}
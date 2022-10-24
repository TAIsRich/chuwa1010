public class Car extends Vehicle
{
    // constructor of the class Car
    public Car(String licPlate, String companyName)
    {
        slotsNeeded = 1;
        siz = VSize.CarSize;
        this.licPlate = licPlate;
        this.companyName = companyName;
    }

    public boolean canFitInSlot(ParkingSlot spot)
    {
// checks if the spot is suitable for a car
        return spot.getSize() == VSize.CarSize;
    }
}
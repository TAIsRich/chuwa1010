package spotsManage;

import enumHold.ParkingSpotType;

public class ElectricSpot extends Spot{
    public ElectricSpot(String number) {
        super(number, ParkingSpotType.ELECTRIC);
    }
}

package spotsManage;

import enumHold.ParkingSpotType;

public class ReservedSpot extends Spot{
    public ReservedSpot(String number) {
        super(number, ParkingSpotType.RESERVED);
    }
}

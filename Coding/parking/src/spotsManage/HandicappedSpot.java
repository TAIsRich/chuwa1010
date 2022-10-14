package spotsManage;

import enumHold.ParkingSpotType;

public class HandicappedSpot extends Spot{

    protected HandicappedSpot(String number) {
        super(number, ParkingSpotType.HANDICAPPED);
    }
}

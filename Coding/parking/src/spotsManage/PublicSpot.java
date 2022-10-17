package spotsManage;

import enumHold.ParkingSpotType;

public class PublicSpot extends Spot{
    public PublicSpot(String number) {
        super(number, ParkingSpotType.PUBLIC);
    }
}

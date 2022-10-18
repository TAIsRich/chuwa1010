package Builder;

public class MobileBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("carbon fiber frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("leather seat");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}

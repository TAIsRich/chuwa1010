package Builder;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("aluminum alloy frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("rubber seat");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}

package Builder;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum Frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Rubber Seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

package builder;

public class MobileBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("Frame A");
    }

    public void buildSeat() {
        bike.setSeat("Seat A");
    }

    public Bike createBike() {
        return bike;
    }
}

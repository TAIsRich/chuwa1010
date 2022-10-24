package builder;

public class OfoBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("Frame B");
    }

    public void buildSeat() {
        bike.setSeat("Seat B");
    }

    public Bike createBike() {
        return bike;
    }

}

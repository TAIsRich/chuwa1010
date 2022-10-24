package DesignPattern.builder;

public class Mobike extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("steel");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("leather");

    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

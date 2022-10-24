package org.example.Builder;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("steel frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("rubber seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

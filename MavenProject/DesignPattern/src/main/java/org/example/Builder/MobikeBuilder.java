package org.example.Builder;

public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Leather seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

package com.chuwa.pattern.builder.demo1;

/**
 * Concrete Builder, to build Ofobike object
 */

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum Alloy Frame");
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

package com.chuwa.pattern.builder.demo1;

/**
 * Concrete Builder, to build MobileBike Object
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Fiber Frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Leather Seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

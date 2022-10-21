package com.chuwa.pattern.builder.demo1;

/**
 *  Director Class
 */

public class Director {
    // declare Builder Class Variable
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // method construct bike
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}

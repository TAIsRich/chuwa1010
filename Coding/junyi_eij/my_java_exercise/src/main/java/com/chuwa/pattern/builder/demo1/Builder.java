package com.chuwa.pattern.builder.demo1;

public abstract class Builder {
    // declare Bike class variable, and assign value
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}

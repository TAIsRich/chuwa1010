package com.chuwa.learn.Builder;

public class MobikeBuilder extends Builder{
    public void buildFrame() {
        mBike.setFrame("车架");
    }

    public void buildSeat() {
        mBike.setSeat("Seat");

    }

    public Bike createBike() {
        return mBike;
    }
}

package com.chuwa.learn.Builder;

public class OfoBuilder extends Builder{
    public void buildFrame() {
        mBike.setFrame("ofo frame");
    }

    public void buildSeat() {
        mBike.setSeat("ofo seat");
    }

    public Bike createBike() {
        return mBike;
    }
}

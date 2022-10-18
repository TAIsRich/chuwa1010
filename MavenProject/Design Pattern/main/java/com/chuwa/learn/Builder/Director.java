package com.chuwa.learn.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder= builder;
    }
    public Bike contruct(){
        this.builder.buildFrame();
        this.builder.buildSeat();
        return builder.createBike();
    }
}

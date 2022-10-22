package com.chuwa.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        //1. create Director Object
        // Since we don't have none-variable constructor in Director class
        // we have to declare what kind to bike we want to build specifically
        Director director = new Director( new MobileBuilder());

        //2. let director direct the bike construction process
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

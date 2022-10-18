package com.chuwa.learn.Builder;

public class Client {
    public static void main(String[] args) {
        show(new OfoBuilder());
        show(new MobikeBuilder());
    }
    public static void show(Builder builder){
        Director d = new Director(builder);
        Bike bike = d.contruct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

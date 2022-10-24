package com.chuwa.learn.Factory;

public class Client {
    public  static void main(String[] args) {
        CoffeeStore cs = new CoffeeStore();
        CoffeeFactory factory = new AmericanoCoffeeFactory();
        cs.setFactory(factory);
        Coffee coffee= cs.orderCoffee();
        System.out.println(coffee.getName());
    }
}

package com.chuwa.learn.Factory;

public class AmericanoCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}

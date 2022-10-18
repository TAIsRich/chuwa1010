package com.chuwa.learn.Factory;

public class LatteCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new LetteCoffee();
    }
}

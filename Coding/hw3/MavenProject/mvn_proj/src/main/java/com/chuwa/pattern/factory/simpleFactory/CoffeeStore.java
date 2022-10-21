package com.chuwa.pattern.factory.simpleFactory;


public class CoffeeStore {
    public Coffee orderCoffee(String coffeeType){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(coffeeType);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

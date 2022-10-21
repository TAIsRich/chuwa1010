package com.chuwa.pattern.factory.staticFactory;


public class CoffeeStore {
    public Coffee orderCoffee(String coffeeType){
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        Coffee coffee = factory.createCoffee(coffeeType);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(coffeeType);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

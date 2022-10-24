package com.chuwa.pattern.factory.staticFactory;

// simple coffee factory class, it is used to create different coffee

public class SimpleCoffeeFactory {
    // static means that we don't have to create a new factory object in each coffee store
    // we can directly use this createCoffee method in Store class
    public static Coffee createCoffee(String coffeeType){
        //declare Coffee variable, different coffee type to create different subclass of coffee
        Coffee coffee = null;
        if (coffeeType.equals("Americano")) {
            coffee = new Americano();
        } else if (coffeeType.equals("Latte")){
            coffee = new Latte();
        } else {
            throw new RuntimeException("Not available coffee type!");
        }
        return coffee;
    }
}

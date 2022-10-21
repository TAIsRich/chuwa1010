package com.chuwa.pattern.factory.simpleFactory;

// simple coffee factory class, it is used to create different coffee
// since we might have so many coffee stores like CoffeeStore1, CoffeeStore2
// if we use code in "before" folder, we have to modify the code in every CoffeeStore class when we create a coffee type

// in this simpleFactory, however, we can just add new code in SimpleCoffeeFactory class, and leave all other Store class unchanged.

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String coffeeType){
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

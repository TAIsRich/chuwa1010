package com.chuwa.pattern.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String coffeeType){
        //declare Coffee variable, different coffee type to create different subclass of coffee
        Coffee coffee = null;
        if (coffeeType.equals("Americano")) {
            coffee = new Americano();
        } else if (coffeeType.equals("Latte")){
            coffee = new Latte();
        } else {
            throw new RuntimeException("Not available coffee type!");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

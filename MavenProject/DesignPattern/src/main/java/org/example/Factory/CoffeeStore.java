package org.example.Factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createcoffee(type);

        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }
}

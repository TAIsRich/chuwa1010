package org.example.simple_factory;



public class CoffeeShop {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }


}

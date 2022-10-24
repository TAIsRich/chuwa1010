package DesignPattern.factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee=coffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}

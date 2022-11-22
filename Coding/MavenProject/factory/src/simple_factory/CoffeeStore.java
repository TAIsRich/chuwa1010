package simple_factory;

import simple_factory.AmericanCoffee;
import simple_factory.Coffee;
import simple_factory.LatteCoffee;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);


        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

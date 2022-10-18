package Factory.NormalFactory;

import Factory.SimpleFactory.SimpleCoffeeFactory;

public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

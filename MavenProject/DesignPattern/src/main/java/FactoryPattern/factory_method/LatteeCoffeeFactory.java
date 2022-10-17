package FactoryPattern.factory_method;

public class LatteeCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteeCoffee();
    }
}

package Factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {

        Factory factory = new Factory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

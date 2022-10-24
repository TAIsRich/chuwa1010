package Factory.SimpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee1 = factory.createCoffee(type);

        coffee1.addSugar();
        coffee1.addMilk();

        // coffee2.addSugar();
        // coffee2.addMilk();

        return coffee1;
        // return coffee2;
    }
}

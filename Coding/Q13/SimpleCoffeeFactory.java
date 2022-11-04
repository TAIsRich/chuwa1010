package Pattern.Factory.SimpleFactory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("Americano")) {
            coffee = new AmericanoCoffee();
        } else if (type.equals("Latte")) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}

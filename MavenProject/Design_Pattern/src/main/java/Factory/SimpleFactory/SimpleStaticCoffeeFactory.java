package Factory.SimpleFactory;

public class SimpleStaticCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;

        if (type.equals("Americano")) {
            coffee = new AmericanCoffee();
        }
        else if (type.equals("Latte")) {
            coffee = new LatteCoffee();
        }
        else {
            throw new RuntimeException("Your order type does not exist.");
        }

        return coffee;
    }
}

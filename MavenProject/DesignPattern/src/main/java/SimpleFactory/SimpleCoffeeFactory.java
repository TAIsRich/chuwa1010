package SimpleFactory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)) {
            coffee = new LatteeCoffee();
        }else {
            throw new RuntimeException("Sorry, out of type");
        }
        return coffee;
    }
}

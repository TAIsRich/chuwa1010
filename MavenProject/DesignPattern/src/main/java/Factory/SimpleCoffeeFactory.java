package Factory;

public class SimpleCoffeeFactory {

    public Coffee createcoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Sorry, your ordered coffee out of stock");
        }

        return coffee;
    }
}

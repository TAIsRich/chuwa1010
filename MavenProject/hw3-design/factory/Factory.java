package Factory;

public class Factory {
    //simple
    public Coffee createCoffee(String type) {
        // create different types of coffee based on coffee object

        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException(" This coffee is not provided.");
        }

        return coffee;
    }
}

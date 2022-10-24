package Factory;

public class FactoryStatic {
    //static

    public static Coffee createCoffee(String type) {

        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("The coffee is not provided.");
        }

        return coffee;
    }





}

package Factory.BeforeFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("Americano")) {
            coffee = new AmericanCoffee();
        } else if (type.equals("Latte")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Your order type does not exist.");
        }
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}

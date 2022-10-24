package Factory.NormalFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeStore store = new CoffeeStore(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());

        CoffeeFactory anotherFactory = new LatteCoffeeFactory();
        store.setFactory(anotherFactory);
        Coffee anotherCoffee = store.orderCoffee();
        System.out.println(anotherCoffee.getName());
    }
}

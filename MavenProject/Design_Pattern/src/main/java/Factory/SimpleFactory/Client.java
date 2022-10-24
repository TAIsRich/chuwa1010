package Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        Coffee coffee1 = store.orderCoffee("Americano");
        System.out.println(coffee1.getName());

        Coffee coffee2 = store.orderCoffee("Latte");
        System.out.println(coffee2.getName());
    }
}

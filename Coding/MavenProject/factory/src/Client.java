import simple_factory.Coffee;
import simple_factory.CoffeeStore;

public class Client {
    public static void main(String[] args) {
        //1. build a store
        CoffeeStore store = new CoffeeStore();

        //2.order a coffee
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
package Factory;

public class Client {
    public static void main(String[] args) {
//        CoffeeStore store = new CoffeeStore();
//        Coffee coffee = store.orderCoffee("latte");
//
//        System.out.println(coffee.getName());

//        AmericanDessertFactory factory = new AmericanDessertFactory();
//
//        Coffee coffee = factory.createCoffee();
//        Dessert dessert = factory.createDessert();
//
//        System.out.println(coffee.getName());
//        dessert.show();

        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}


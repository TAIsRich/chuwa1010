package Factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        DessertStore store = new DessertStore();
        DessertFactory factory = new ItalyDessertFactory();
        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();
        Dessert dessert = store.orderDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}

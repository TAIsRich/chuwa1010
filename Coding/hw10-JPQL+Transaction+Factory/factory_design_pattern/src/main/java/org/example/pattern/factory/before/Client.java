package org.example.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.orderCoffee("Americano");

        System.out.println(coffee.getName());
    }
}

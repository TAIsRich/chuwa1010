package org.example.simple_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        Coffee coffee = shop.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}

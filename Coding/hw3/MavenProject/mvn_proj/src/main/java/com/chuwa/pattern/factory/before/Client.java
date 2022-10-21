package com.chuwa.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        //1. create coffee store
        CoffeeStore store = new CoffeeStore();

        //2. order coffee
        Coffee coffee =  store.orderCoffee("Americano");
        System.out.println(coffee.getName());
    }
}

package org.example;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new Americano();
        }else if("latte".equals(type)) {
            coffee = new Latte();
        }else{
            throw new RuntimeException("Sorry, no such drink");
        }
        return coffee;
    }
}

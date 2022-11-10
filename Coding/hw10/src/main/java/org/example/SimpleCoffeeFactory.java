package org.example;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee= null;
        if("americano".equals(type)){
            coffee= new AmericanoCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}

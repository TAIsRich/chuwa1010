package com.chuwa.learn.Factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee=null;
        if("americano".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee= new LetteCoffee();
        }else {
            throw new RuntimeException("out of stock");
        }

        return coffee;
    }
}

package com.chuwa.learn.Factory;

public class CoffeeStore {
    private CoffeeFactory factory;
    public void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }
    public Coffee orderCoffee(){

        Coffee coffee=this.factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

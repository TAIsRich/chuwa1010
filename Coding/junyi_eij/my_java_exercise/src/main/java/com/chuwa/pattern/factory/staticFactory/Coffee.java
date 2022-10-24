package com.chuwa.pattern.factory.staticFactory;

// Coffee : Top class

public abstract class Coffee {

    public abstract String getName();// since we have abstract method, so the Coffee class is also abstract

    public void addSugar(){
        System.out.println("sugar added");
    }
    public void addMilk(){
        System.out.println("milk added");
    }
}

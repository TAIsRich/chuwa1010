package com.chuwa.learn.Factory;

public abstract class Coffee {
    public abstract String getName();
    public void addSugar(){
        System.out.println("add Sugar");
    }

    public void addMilk(){
        System.out.println("add milk");
    }
}

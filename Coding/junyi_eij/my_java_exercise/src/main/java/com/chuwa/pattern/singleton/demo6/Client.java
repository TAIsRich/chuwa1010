package com.chuwa.pattern.singleton.demo6;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2  = Singleton.INSTANCE;

        System.out.println(instance2==instance1); // if true then i1 i2 are the same object
    }
}

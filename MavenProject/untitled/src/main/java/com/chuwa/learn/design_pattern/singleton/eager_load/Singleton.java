package com.chuwa.learn.design_pattern.singleton.eager_load;

public class Singleton {
    private Singleton() {}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

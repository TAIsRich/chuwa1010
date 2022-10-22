package com.chuwa.pattern.singleton.demo5;

// singleton : lazy load
// method: static inner class

public class Singleton {
    private Singleton() {}

    private static class SingletonHolder{
        // INSTANCE all uppercase as we define it as final (constant value)
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
// why this is lazy load?
// because when JVM is doing class-loading, it will not load STATIC INNER class,
// instead, JVM will only load static inner class when some inner class field or method will be used
//**Classloader loads the static class in JVM only at the time of the first usage, not when its enclosing class gets loaded.

// since we use static keyword for this innerclass SingletonHolder, it will only be instantiated once.
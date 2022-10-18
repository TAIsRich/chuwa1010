package org.example.Singleton;

public class SingletonEagerLoad {
    // Eager Load
    private static SingletonEagerLoad instance = new SingletonEagerLoad();
    private SingletonEagerLoad(){

    }
    public static SingletonEagerLoad getInstance(){
        return instance;
    }



}

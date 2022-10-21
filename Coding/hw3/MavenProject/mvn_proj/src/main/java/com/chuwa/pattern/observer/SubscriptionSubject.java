package com.chuwa.pattern.observer;

import java.util.*;

/**
 * Concrete subject class
 */

public class SubscriptionSubject implements Subject{

    // define a Collection to save many observer object
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // let every observer to invoke update method
        // traverse userList
        for (Observer observer : userList){
            observer.update(message);
        }

    }
}

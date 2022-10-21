package com.chuwa.pattern.observer;

/**
 * abstract Subject class
 */

public interface Subject {
    // add subscriber
    void attach(Observer observer);

    //delete subscriber
    void detach(Observer observer);

    //inform subscriber/observer for the update
    void notify(String message);

}

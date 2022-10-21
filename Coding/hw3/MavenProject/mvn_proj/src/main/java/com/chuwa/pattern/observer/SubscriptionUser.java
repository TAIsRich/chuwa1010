package com.chuwa.pattern.observer;

/**
 * Concrete Observer Class
 */
public class SubscriptionUser implements Observer{

    // username
    private String name;
    public SubscriptionUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }

    // getter and setter, not important in this case
    public String getName() {
        return name;
    }patt

    public void setName(String name) {
        this.name = name;
    }
}

package com.chuwa.learn.PublisherAndSubcriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    public void notify(String message) {
        for(Observer observer:weixinUserlist){
            observer.update(message);
        }
    }
}

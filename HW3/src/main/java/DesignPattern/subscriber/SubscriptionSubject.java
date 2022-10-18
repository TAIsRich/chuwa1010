package DesignPattern.subscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    private List<Observer> user = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        user.add(observer);

    }

    @Override
    public void detach(Observer observer) {
 user.remove(observer);

    }

    @Override
    public void notify(String message) {
        for(Observer o:user){
            o.update(message);
        }

    }
}

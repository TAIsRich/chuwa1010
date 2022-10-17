package PublishScribe;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    //concreteSubject

    //define collections for storing multiple observers
    private List<Observer> weixinUerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //iterate the list
        for(Observer observer: weixinUerList){
            observer.update(message);
        }
    }
}

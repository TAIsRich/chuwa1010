package Pattern.Publisher_Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> userList = new ArrayList<Observer>();

    public SubscriptionSubject() {
        super();
    }

    public void attach(Observer observer) {
        userList.add(observer);
    }

    public void detach(Observer observer) {
        userList.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }
    }
}

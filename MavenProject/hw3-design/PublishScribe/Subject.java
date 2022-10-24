package PublishScribe;

public interface Subject {

    //subject(abstract being observed), concreteSubject(specified being observed, if any change, notify observers)
    //observer(abstract, update itself when notified), concreteObserver(update state)

    //add subscribers
    void attach(Observer observer);

    //delete subscribers
    void detach(Observer observer);

    //notify subscribers
    void notify(String message);
}

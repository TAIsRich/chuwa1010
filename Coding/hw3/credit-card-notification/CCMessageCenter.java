import java.util.ArrayList;
import java.util.List;

public class CCMessageCenter implements Subject {
    ArrayList<Observer> users = new ArrayList<>();

    @Override
    public void attach(Observer observer){
        users.add(observer);
        observer.update("you have successfully registered to add your "+((User)observer).getNotificationType()+
                ". Please use this for future references.");
    }
    @Override
    public void detach(Observer observer){
        users.remove(observer);
    }

    @Override
    public void notify(String message){
        users.stream().forEach(user -> user.update(message));
    }

    public void printAllLatestNotifications(){
        users.stream().forEach(observer -> ((User)observer).printLatestNotification());
    }
}

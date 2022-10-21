import java.util.ArrayList;

enum NotificationType{
    EMAIL,SMS,WHATSAPP
}
public class User implements Observer{
    private String firstName;
    private NotificationType type;
    private ArrayList<Notification> notifications = new ArrayList<>();

    public User(String firstName, NotificationType type){
        this.firstName = firstName;
        this.type = type;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getNotificationType(){
        return type.name();
    }

    public void printLatestNotification(){
        notifications.get(notifications.size()-1).printNotification();
    }

    @Override
    public void update(String message) {
        this.notifications.add(new Notification(this.type, "Hey "+this.firstName+", "+message));
    }
}

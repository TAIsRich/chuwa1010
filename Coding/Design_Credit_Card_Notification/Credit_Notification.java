import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Credit_Notification {
    public static void main(String[] args) {
        Card card = new Card("card1");
        User user1 = new Developer("firstName", "LastName");
        User user2 = new Developer("firstName", "LastName");
        department.sendNotification("Hi there hello", Type.email);
    }
}

@Data
@AllArgsConstructor
class Notification{
    private String Subject;
    private String message;
    private Notifiable user;
}

enum Type {
    Email,
    SMS,
    WhatsAPP;
}

abstract class Notifiable<T>{
    T t;
    private String Id;

    public Notifiable(String Id){
        this.Id=Id;
    }
    public abstract void sendNotification(String message, Type level);
    public abstract void getNotified(Notification notification , Type level);

    public String getId(){
        return this.Id;
    }
}


class Card extends Notifiable{

    private List<Notifiable<Department>> notifiables = new ArrayList<>();

    public Card(String usereId){
        super(userId);
    }

    @Override
    public void sendNotification(String message, Type type) {
        Notification notification = new Notification("test",message,this);
        for (Notifiable notifiable : notifiables){
            notifiable.getNotified(notification,Type. Email);
        }
    }

    @Override
    public void getNotified(Notification notification , Type type) {
        System.out.println("CEO : "+this.getId() +" "+notification.getMessage());
        sendNotification(notification.getMessage(),Type.SMS);
    }

    public void attach(Notifiable observer){
        notifiables.add(observer);
    }
}
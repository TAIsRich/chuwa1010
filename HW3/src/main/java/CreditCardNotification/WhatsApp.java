package CreditCardNotification;

public class WhatsApp implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a WhatsApp notification");
    }
}

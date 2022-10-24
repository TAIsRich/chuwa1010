public class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending an Email Notification:");
        System.out.println("Hey firstName, you have successfully registered to add and here is your , please use this for future references.");
    }
}

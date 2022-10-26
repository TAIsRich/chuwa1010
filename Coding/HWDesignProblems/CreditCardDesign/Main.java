package HWDesignProblems.CreditCardDesign;

public class Main {
    public static void main(String[] args)
    {
        try{
            Main.call();
        }catch (ErrorMessage e) {
            System.out.println(e);
        }finally {
            System.out.println("Public Broadcast: 40% off when you buy Popeyes between 06/13 - 06/19");
        }

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notification();


    }
    public static void call() {
        throw new ErrorMessage(ResultCode.FAILED);
    }
}
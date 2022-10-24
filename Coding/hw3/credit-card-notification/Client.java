import java.util.Arrays;

public class Client {
    public static void main(String[] args){
        CCMessageCenter cc = new CCMessageCenter();

        cc.attach(new User("John", NotificationType.EMAIL));
        cc.attach(new User("Jack", NotificationType.SMS));
        cc.attach(new User("Jenny", NotificationType.WHATSAPP));

        cc.printAllLatestNotifications();
        /*
        EMAIL | Hey John, you have successfully registered to add your EMAIL. Please use this for future references.
        SMS | Hey Jack, you have successfully registered to add your SMS. Please use this for future references.
        WHATSAPP | Hey Jenny, you have successfully registered to add your WHATSAPP. Please use this for future references.
         */

        cc.notify("30% off when you buy Popeyes between 06/13 - 06/19");

        cc.printAllLatestNotifications();
        /*
        EMAIL | Hey John, 30% off when you buy Popeyes between 06/13 - 06/19
        SMS | Hey Jack, 30% off when you buy Popeyes between 06/13 - 06/19
        WHATSAPP | Hey Jenny, 30% off when you buy Popeyes between 06/13 - 06/19
         */
    }
}

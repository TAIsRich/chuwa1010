package notification_design;

import java.util.*;

public class NotificationSender {
    NotificationFactory notificationFactory = new NotificationFactory();

    public void sendNotificationTo(String message, User user){
        String processedMessage = message.replaceAll("(USER_NAME)$", user.getName());
        notificationFactory.createNotification(user.getNotificationPreference()).send_notification(processedMessage);
    }

    public void broadcastNotification(String message, List<User> userList){
        for(User user : userList){
            sendNotificationTo(message, user);
        }
    }
}

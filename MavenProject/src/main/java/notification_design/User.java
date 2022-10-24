package notification_design;

public class User {
    private String name;
    private String notificationPreference;

    public User(String name, String notificationPreference){
        this.name = name;
        this.notificationPreference = notificationPreference;
    }

    public String getName() {
        return name;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }
}

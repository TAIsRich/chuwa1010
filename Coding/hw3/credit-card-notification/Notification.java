public class Notification {
    private NotificationType type;
    private String content;

    public Notification(NotificationType type, String content){
        this.type = type;
        this.content = content;
    }

    public void printNotification(){
        System.out.println(type.name() + " | "+content);
    }
}

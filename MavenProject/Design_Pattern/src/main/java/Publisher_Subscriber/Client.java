package Publisher_Subscriber;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:19 AM
 * @ClassName Client
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();

        WeiXinUser apple = new WeiXinUser("apple");
        WeiXinUser peach = new WeiXinUser("peach");
        WeiXinUser melon = new WeiXinUser("melon");
        subject.attach(apple);
        subject.attach(peach);
        subject.attach(melon);

        subject.notify("I will pick you.");

        subject.detach(melon);
        subject.notify("Melon has found a SDE job, and you are our candidates now.");
    }
}

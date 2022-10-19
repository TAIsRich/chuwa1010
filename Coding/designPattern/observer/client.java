public class client{
    public static void main(String[] args){
        //创建公众号对象
        Subject subject= new SubscriptionSubject();

        //添加订阅者
        WeiXinUser apple= new WeiXinUser("apple");
        WeiXinUser peach= new WeiXinUser("peach");
        WeiXinUser melon= new WeiXinUser("melon");
        subject.attach(apple);
        subject.attach(peach);
        subject.attach(melon);
    }

}
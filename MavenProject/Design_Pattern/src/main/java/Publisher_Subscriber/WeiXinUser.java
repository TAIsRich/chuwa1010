package Publisher_Subscriber;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:18 AM
 * @ClassName WeiXinUser
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}


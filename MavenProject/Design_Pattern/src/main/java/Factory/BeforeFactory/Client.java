package Factory.BeforeFactory;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:20 PM
 * @ClassName Client
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店类object
        CoffeeStore store = new CoffeeStore();

        // 点咖啡
        Coffee coffee1 = store.orderCoffee("Americano");
        System.out.println(coffee1.getName());

        Coffee coffee2 = store.orderCoffee("Latte");
        System.out.println(coffee2.getName());
    }
}

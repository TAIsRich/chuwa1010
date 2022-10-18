package Factory.BeforeFactory;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:20 PM
 * @ClassName Coffee
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("Add sugar.");
    }

    public void addMilk() {
        System.out.println("Add milk.");
    }
}

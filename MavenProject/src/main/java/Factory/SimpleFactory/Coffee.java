package Factory.SimpleFactory;

/**
 * @Author: Wenfu Yang
 * @ClassName: Coffee
 * @Description: Todo
 * @Date: 10/19/2022
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

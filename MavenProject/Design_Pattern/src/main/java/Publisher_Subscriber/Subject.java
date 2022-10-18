package Publisher_Subscriber;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:20 AM
 * @ClassName Subject
 */

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}


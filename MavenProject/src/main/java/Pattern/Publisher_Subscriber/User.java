package Pattern.Publisher_Subscriber;

public class User implements Observer {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + "_" + message);
    }
}

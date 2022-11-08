public interface Subject {
    public void attach(Subscriber user);
    public void detach(Subscriber user);
    public void notify(String message);
}

public interface Subject {
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);

    public abstract void notify(String message);
}

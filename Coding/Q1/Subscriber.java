public class Subscriber implements Observer{
    String firstName;
    Preference preference;

    public Subscriber(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void update(Preference preference, String message) {
        System.out.println("Hello! " + preference.getPreference() + " subscriber!");
        System.out.println(message);
    }
}

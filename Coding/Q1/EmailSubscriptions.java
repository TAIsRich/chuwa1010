import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSubscriptions implements Subject {
    Subscriber user;

    Map<NotificationType, List<Subscriber>> map = new HashMap<>();

    @Override
    public void attach(Subscriber user) {
        if (user.preference != null) {
            NotificationType type = user.preference.getPreference();
            map.putIfAbsent(type, new ArrayList<>());
            map.get(type).add(user);
        }
        System.out.println("Hey " + user.firstName + ", you have successfully registered to add and here is your , " +
                        "please use this for future references.");
    }

    @Override
    public void detach(Subscriber user) {
        NotificationType type = user.preference.getPreference();
        map.get(type).remove(user);
    }

    @Override
    public void notify(String message) {
        for (NotificationType type : map.keySet()) {
            for (Subscriber user : map.get(type)) {
                user.update(user.preference, message);
            }
        }
    }
}

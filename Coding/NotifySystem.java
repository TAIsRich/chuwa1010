public class NotifySystem {
    public static notify(User p) {
        p.type.send(p);
    }

    public static notifyAll() {
        String message = "40% off when you buy Popeyes between 06/13 - 06/19";
        for(User p : UserList.record) {
            p.type.send(p);
        }
    }
}
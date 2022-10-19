public class UserList {
    private static List<User> record = new ArrayList<>();

    public List<User> getRecord() {
        return record;
    }

    public void setRecord(List<User> record) {
        this.record = record;
    }

    public static void addUser(User p) {
        record.add(p);
    }
}
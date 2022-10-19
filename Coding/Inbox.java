public class Inbox {
    private static List<String> mss = new ArrayList<>();

    public static List<String> getMss() {
        return mss;
    }

    public static void setMss(List<String> mss) {
        Inbox.mss = mss;
    }

    public void add(String message) {
        mss.add(message);
    }
}
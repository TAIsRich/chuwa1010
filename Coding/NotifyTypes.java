public enum NotifyTypes {
    EMAIL,
    SMS,
    WHATSAPP;

    public void send(User p) {
        Inbox box = p.getInbox();
        String message = "Hey " + p.getName() + ", you have successfully registered to add and here is your , please use this for\n" +
                "future references."
        box.add(message);
    }
}
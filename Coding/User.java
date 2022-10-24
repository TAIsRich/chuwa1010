public class User {
    private String name;
    private String prefer;

    private NotifyTypes type;

    private Inbox inbox;

    private static final HashSet<String> set = new HashSet<>(Arrays.asList("email", "sms", "whatsapp"));


    public User(String name, String prefer) {
        this.name = name;
        this.prefer = prefer.toLowerCase();
        this.inbox = new Inbox();
        if(!set.contains(prefer.toLowerCase())) throw new FormatException("Your notification reference format is not correct.");
        switch (name.toLowerCase()) {
            case "email" :
                this.type = NotifyTypes.EMAIL;
                break;
            case "sms" :
                this.type = NotifyTypes.SMS;
                break;
            case "whatsapp" :
                this.type = NotifyTypes.WHATSAPP;
                break;
        }
        UserList.addUser(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefer(Type prefer) {
        this.prefer = prefer;
    }

    public String getName() {
        return name;
    }

    public Type getPrefer() {
        return prefer;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

}
public class Preference {
    NotificationType type;
    String email;
    String phoneNumber;
    String whatsAppID;

    private Preference(NotificationType type, String email, String phoneNumber, String whatsAppID) {
        this.type = type;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.whatsAppID = whatsAppID;
    };

    public NotificationType getPreference() {
        return this.type;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getWhatsAppID() {
        return this.whatsAppID;
    }

    public static Preference createEmailPreference(NotificationType type, String email) {
        if (type.equals("EMAIL") && email != null) {
            return new Preference(type, email, null, null);
        }
        return null;
    }

    public static Preference createSMSPreference(NotificationType type, String phoneNumber) {
        if (type.equals("SMS") && phoneNumber != null) {
            return new Preference(type, null, phoneNumber, null);
        }
        return null;
    }

    public static Preference createWhatsAppPreference(NotificationType type, String whatsAppID) {
        if (type.equals("WHATSAPP") && whatsAppID != null) {
            return new Preference(type, null, null, whatsAppID);
        }
        return null;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        User user = new User("Anna", "123456");
        user.login("Anna", "4321");
        user.login("Anna", "123456");
    }
}

class User {
    private String userName;
    private String password;

    public User(String username, String pswd) {
        this.userName = username;
        this.password = pswd;
    }

    public void login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}


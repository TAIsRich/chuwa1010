public class main {

    public static void main(String args[]){
        Account a = new Account(101);

        a.setFirstName("John");
        a.setLastName("Smith");
        a.setUsername("johnsmith101");
        a.setEmail("johnsmith101@sample.org");
        a.setBalance(123.45);

        System.out.println("Name: "+a.getFirstName() +" "+a.getLastName());
        System.out.println("Username: "+a.getUsername());
        System.out.println("Email: "+a.getEmail());
        System.out.println("Balance: "+a.getBalance());
    }
}

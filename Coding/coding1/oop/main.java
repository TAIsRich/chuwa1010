public class main {

    public static void main(String args[]){

        //Encapsulation demo
        Account a = new Account(101);

        a.setFirstName("John");
        a.setLastName("Smith");
        a.setUsername("johnsmith101");
        a.setEmail("johnsmith101@sample.org");
        a.setBalance(123.45);

        System.out.println("Name: "+a.getFirstName() +" "+a.getLastName());
        System.out.println("Username: "+a.getUsername());
        System.out.println("Email: "+a.getEmail());
        System.out.println("Balance: "+a.getBalance()+"\n");

        //Inheritance demo
        Account b1 = new CashAccount(102);

        b1.setFirstName("Jerry");
        b1.setLastName("Smith");
        b1.setUsername("jerrysmit102");
        b1.setEmail("jerrysmith102@sample.org");
        b1.setBalance(666.10);

        System.out.println("Name: "+b1.getFirstName() +" "+b1.getLastName());
        System.out.println("Username: "+b1.getUsername());
        System.out.println("Email: "+b1.getEmail());
        System.out.println("Balance: "+b1.getBalance()+"\n");

        //Static Polymorphism demo (via constructor)
        Account b2 = new MarginAccount(103, 0.25);

        b2.setFirstName("Jerry");
        b2.setLastName("Smith");
        b2.setUsername("jerrysmit102");
        b2.setEmail("jerrysmith102@sample.org");
        b2.setBalance(666.10);

        System.out.println("Name: "+b2.getFirstName() +" "+b2.getLastName());
        System.out.println("Username: "+b2.getUsername());
        System.out.println("Email: "+b2.getEmail());
        System.out.println("Balance: "+b2.getBalance());
        //cast type to access subclass method
        System.out.println("Margin Requirement: "+ ((MarginAccount) b2).getMarginRequirement()+"\n");

        //Dynamic Polymorphism demo
        a.printType();
        b1.printType();
        b2.printType();
    }
}

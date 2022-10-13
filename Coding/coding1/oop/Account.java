public class Account {
    public int assignedId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private double balance;

    //Static Polymorphism
    public Account(){
        assignedId = 0;
    }

    public Account(int id){
        assignedId = id;
    }

    //Encapsulation
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public double getBalance(){
        return balance;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void printType(){System.out.println("Account");}
}

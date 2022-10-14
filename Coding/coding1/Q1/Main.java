package org.example;
public class Main {
    public static void main(String[] args) {
        //Encapsulation
        System.out.println("This is Encapsulation");
        Account acc = new Account();
        acc.setAcc_num(5468742);
        acc.setName("Bob Sage");
        acc.setEmail("bobsage@gmail.com");
        acc.setBalance(500000f);
        System.out.println(acc.getAcc_num()+" "+acc.getName()+" "+acc.getEmail()+" "+ acc.getBalance());

        //Polymorphism
        System.out.println("This is Polymorphism");
        Shape sh = new Shape();
        System.out.println("This shape's parameter is : " + sh.getPerimeter());
        Circle circle = new Circle(4);
        System.out.println("This circle's parameter is : " + circle.getPerimeter());

        //Inheritance
        System.out.println("This is Inheritance");
        Rectangle rectangle = new Rectangle(3,8);
        System.out.println("This rectangle area is : " + rectangle.getArea());
        System.out.println("This rectangle parameter is : " + rectangle.getPerimeter());
    }

}
class Account {
    private long acc_num;
    private String name, email;
    private float balance;
    public long getAcc_num(){
        return acc_num;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

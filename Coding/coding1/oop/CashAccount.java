//Inheritance
public class CashAccount extends Account{
    //Static Polymorphism
    public CashAccount(){
        super();
    }
    public CashAccount(int id){
        super(id);
    }

    //Dynamic Polymorphism
    @Override
    public void printType(){System.out.println("Cash Account");}
}

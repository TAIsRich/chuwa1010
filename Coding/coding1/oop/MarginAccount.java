//Inheritance
public class MarginAccount extends Account{
    private double marginRequirement;

    //Static Polymorphism
    public MarginAccount(){
        super();
    }
    public MarginAccount(int id){
        super(id);
    }

    public MarginAccount(int id, double marginRequirement){
        super(id);
        this.marginRequirement = marginRequirement;
    }

    public double getMarginRequirement() {
        return marginRequirement;
    }

    public void setMarginRequirement(double marginRequirement) {
        this.marginRequirement = marginRequirement;
    }

    //Dynamic Polymorphism
    @Override
    public void printType(){System.out.println("Margin Account");}
}

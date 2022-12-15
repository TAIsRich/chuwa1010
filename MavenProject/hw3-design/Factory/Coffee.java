package Factory;

public abstract class Coffee {

    public abstract String getName();


    public void addSugar() {
        System.out.println("sugar");
    }


    public void addMilk() {
        System.out.println("milk");
    }
}
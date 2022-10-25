package Factory.abstract_factory;

public class DessertStore {
    private DessertFactory factory;

    public void setFactory(DessertFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public Dessert orderDessert(){
        Dessert dessert = factory.createDessert();
        return dessert;
    }
}

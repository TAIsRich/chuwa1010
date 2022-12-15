package Factory;

public interface DessertFactory {
    //abstract
    //multiple level object: same brand object, same type  object
    //roles: abstract factory, concrete factory, product, concreteProduct

    //american or italy

    Coffee createCoffee();

    Dessert createDessert();
}


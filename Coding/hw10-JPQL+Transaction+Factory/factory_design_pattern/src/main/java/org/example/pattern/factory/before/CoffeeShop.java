package org.example.pattern.factory.before;

public class CoffeeShop {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if (type.equalsIgnoreCase("Americano")) {
            coffee = new Americano();
        } else if (type.equalsIgnoreCase("Latte")) {
            coffee = new Latte();
        } else {
            throw new RuntimeException(type+" not available!");
        }

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

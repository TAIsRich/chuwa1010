public class CoffeeStore {
    //simpleCoffeeFactory coffeeFactory = new simpleCoffeeFactory();

    public Coffee orderCoffee(String coffeeName){
        Coffee coffee = simpleCoffeeFactory.createCoffee(coffeeName);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

public class LatteFactory implements CoffeeFactory{
    @Override
    public coffee createCoffee(){
        return new LatteCoffee();
    }
}
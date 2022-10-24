package DesignPattern.factory;

public class CoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee=null;
        if ("Starbucks".equals(type)) {
            coffee=new Starbucks();
        }else if ("BlackCoffee".equals(type)){
            coffee= new BlackCoffee();
        }else {
            throw new RuntimeException("No such coffee");
        }
        return coffee;
    }
}

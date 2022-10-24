public class SimpleStaticCoffeeFactory{
    public static Coffee createCoffee(String type){
        //声明咖啡类变量，根据不同的input type 创建不同的咖啡子类object
        Coffee coffee= null;
        if(type.equals("Americano")){
            coffee= new AmericanCoffee();
        }
        else if(type.equals("Latte")){
            coffee = new LatteCoffee();
        }
        else {
            throw new RuntimeException("Your order type does not exist.");
        }
        return coffee;
    }
}
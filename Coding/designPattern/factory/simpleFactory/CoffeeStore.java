public class CoffeeStore{
    public Coffee orderCoffee(String type){
        //声明简单工厂类变量
        SimpleCoffeeFactory factory= new SimpleCoffeeFactory();
        //调用生产咖啡的方法来根据不同的input type创建不同的咖啡子类object
        Coffee coffee1= factory.createCoffee(type);

        //调用简单静态类工厂类的生产咖啡方法来根据不同的input type创建不同的咖啡子类object
        //Coffee coffee2 = SimpleStaticCoffeeFactory.createCoffee(type);

        //加配料
        coffee1.addSugar();
        coffee1.addMilk();

        return coffee1;
    }
}
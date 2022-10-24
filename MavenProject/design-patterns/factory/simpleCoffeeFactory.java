public class simpleCoffeeFactory {
    public static Coffee createCoffee(String coffeeName){
        if(coffeeName.equals("Americano")){
            return new Americano();
        }else if(coffeeName.equals("Cafe Latte")){
            return new CafeLatte();
        }else{
            throw new RuntimeException("Coffee not found.");
        }
    }
}

package Generic.Generic_Class;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(5.55);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("Hello");
        System.out.println(obj3.getObj());
    }
}

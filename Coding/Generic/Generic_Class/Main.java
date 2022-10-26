package Generic.Generic_Class;

public class Main {
    public static void main(String[] args) {
        Generic.Generic_Class.GenericClass<Integer> obj1 = new Generic.Generic_Class.GenericClass<>(5);
        System.out.println(obj1.getObj());

        Generic.Generic_Class.GenericClass<Double> obj2 = new Generic.Generic_Class.GenericClass<>(5.55);
        System.out.println(obj2.getObj());

        Generic.Generic_Class.GenericClass<String> obj3 = new Generic.Generic_Class.GenericClass<>("Hello");
        System.out.println(obj3.getObj());
    }
}

package genericPractice;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<Integer>(5);
        System.out.println(obj1);
        GenericClass<Double> obj2 = new GenericClass<>(5.20);
        System.out.println(obj2);
        GenericClass<String> obj3 = new GenericClass<>("Hello ");

        System.out.println(obj3);
    }
}

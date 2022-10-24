package org.example;

public class GenericClassTest {
    public static void main(String[] args) {

        // test for Integer type
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.getObj());

        //test for Double type
        GenericClass<Double> obj2 = new GenericClass<>(15.77772);
        System.out.println(obj2.getObj());

        // test for String type
        GenericClass<String> obj3 = new GenericClass<>("Yayy! That is my first Generic Class");
        System.out.println(obj3.getObj());

    }
}

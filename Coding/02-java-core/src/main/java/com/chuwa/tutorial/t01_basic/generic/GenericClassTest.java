package com.chuwa.tutorial.t01_basic.generic;

/**
 * @author b1go
 * @date 7/25/22 12:18 AM
 */
public class GenericClassTest {

    public static void main(String[] args) {
        // Test for Integer type
        GenericClass_ZhiquanTest<Integer> testObject1 = new GenericClass_ZhiquanTest<>(100);
        System.out.println(testObject1.getObj());

        // Test for double type
        GenericClass_ZhiquanTest<Double> testObject2 = new GenericClass_ZhiquanTest<>(3.1415926535897);
        System.out.print(testObject2.getObj());

        // Test for String type
        GenericClass_ZhiquanTest<String> testObject3 = new GenericClass_ZhiquanTest<String>(
                "\nThis is a test file to rewrite GenericClass, the function name is very long");
        System.out.print(testObject3.getObj());
    }
}

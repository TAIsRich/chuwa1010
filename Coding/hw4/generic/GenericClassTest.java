package com.chuwa.tutorial.t01_basic.generic;

import java.util.ArrayList;

/**
 * @author b1go
 * @date 7/25/22 12:18 AM
 */
public class GenericClassTest {

    public static void main(String[] args) {
       GenericClass<Integer> obj1 = new GenericClass<Integer>(1);
       GenericClass<Character> obj2 = new GenericClass<Character>('a');
       GenericClass<Boolean> obj3 = new GenericClass<Boolean>(true);
       GenericClass<ArrayList<int []>> obj4 = new GenericClass<ArrayList<int []>>(new ArrayList<>());

       System.out.println(obj1.getObj());
       System.out.println(obj2.getObj());
       System.out.println(obj3.getObj());
       System.out.println(obj1.getObj().getClass());
    }
}

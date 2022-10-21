package com.chuwa.tutorial.t01_basic.generic;

/**
 * @author b1go
 * @date 7/25/22 12:17 AM
 */
public class GenericClass_ZhiquanTest<T> {
    // T -> Integer, User, Product
    T obj;

    public GenericClass_ZhiquanTest(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}

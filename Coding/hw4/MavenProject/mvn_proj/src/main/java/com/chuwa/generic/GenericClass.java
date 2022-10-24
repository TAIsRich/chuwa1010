package com.chuwa.generic;

public class GenericClass<T> {
    // T can be Integer, User, Product, but cannot be primitives like int, char
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}

package com.chuwa.hw4_1019.Coding.generic;

/**
 * @author Chenyu
 * @date 10/19/22
 */

public class GenericClass<T> {
    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {return this.obj;}
}

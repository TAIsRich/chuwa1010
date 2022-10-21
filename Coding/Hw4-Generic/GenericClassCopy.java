package com.chuwa.tutorial.t01_basic.generic;

public class GenericClassCopy<T> {
    T obj;
    public GenericClassCopy(T obj){this.obj= obj;}
    public T getObj(){return this.obj;}

}

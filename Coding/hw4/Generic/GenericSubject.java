package org.example;

public class GenericSubject<T> {
    T obj;

    public GenericSubject(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }


}

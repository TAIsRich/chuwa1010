package org.example;

public class DIMImpl implements DIML{

    //could not override default method in interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

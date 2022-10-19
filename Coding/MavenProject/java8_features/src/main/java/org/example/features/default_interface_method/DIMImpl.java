package org.example.features.default_interface_method;

public class DIMImpl implements DIML{
    @Override
    //必须override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    //有body，不override也可
    public int substract(int a, int b) {
        return DIML.super.substract(a, b);
    }
}

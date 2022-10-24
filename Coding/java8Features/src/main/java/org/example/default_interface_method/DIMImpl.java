package org.example.default_interface_method;

public class DIMImpl implements DIML{

    /*
    只需要override add, substract 是default，不override也不会报错
    但如果不override add，会报错
     */
    @Override
    public int add (int a, int b){
        return a + b;
    }
}

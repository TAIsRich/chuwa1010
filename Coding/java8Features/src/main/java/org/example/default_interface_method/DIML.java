package org.example.default_interface_method;

public interface DIML {
    static final String BLOG = "is chuwa a";

    int add(int a, int b);

    default int substract (int a, int b){
        return a - b;
    }

    static String bolgName(){
        return BLOG;
    }
}

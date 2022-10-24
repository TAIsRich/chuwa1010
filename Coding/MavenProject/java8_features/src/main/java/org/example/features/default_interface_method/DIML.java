package org.example.features.default_interface_method;

public interface DIML {
    String BLOG = "is Ych";

    int add(int a, int b);

    default int substract(int a, int b){ return a - b; }

    static String blogName(){return BLOG;}
}

package org.example.features.lambda;

public interface Foo extends Baz, Bar{
    @Override
    default String defaultCommon() {
        //return Baz.super.defaultCommon();
        String s = "defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}

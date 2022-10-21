package com.chuwa.tutorial.t06_java8.features.lambdaCopy;

@FunctionalInterface
public interface Foo extends Baz, Bar {

    @Override
    default String defaultCommon(){
        String s="defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}

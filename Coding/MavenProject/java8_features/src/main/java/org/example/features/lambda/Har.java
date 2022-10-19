package org.example.features.lambda;

@FunctionalInterface
public interface Har<T> {

    String ty(T t);
}

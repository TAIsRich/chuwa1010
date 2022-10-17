package org.example.oop_03_interface;

public class Architect implements Person{

    @Override
    public void learn() {
        System.out.println("Architect learns.");
    }

    @Override
    public void practice() {
        System.out.println("Architect practices.");
    }
}

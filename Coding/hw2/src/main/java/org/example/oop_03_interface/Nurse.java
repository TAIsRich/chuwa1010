package org.example.oop_03_interface;

public class Nurse implements Person{

    @Override
    public void learn() {
        System.out.println("Nurse learns");
    }

    @Override
    public void practice() {
        System.out.println("Nurse practices");
    }
}

package InheritancePractice;

import InheritancePractice.Animal
public class Dog extends Animal{
    @Overide
    public void eat() {
        System.out.println("the dog eat bones");
    }

    @Override
    public void run() {
        System.out.println("the dog runs on four legs");
    }
}
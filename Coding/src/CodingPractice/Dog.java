package CodingPractice;

import CodingPractice.animal;

public class Dog extends animal {
    @Override
    public void eat() {
        System.out.println("Eat bone");
    }

    @Override
    public void drink() {
        super.drink();
    }
}

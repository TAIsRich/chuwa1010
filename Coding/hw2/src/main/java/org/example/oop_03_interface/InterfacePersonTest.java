package org.example.oop_03_interface;

public class InterfacePersonTest {
    public static void main(String[] args) {
        Person person1 = new Architect();
        Person person2 = new Nurse();
        person1.learn();
        person1.practice();
        person2.learn();
        person2.practice();
    }
}

package Inheritance;

public abstract class Person {
    public String name;
    public String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void introduce() {
        System.out.println("My name is " + this.name + ".");
    }
}

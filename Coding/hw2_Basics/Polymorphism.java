// reference: https://www.runoob.com/java/java-polymorphism.html
public class Polymorphism {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.work();
    }

    public static void show(Animal a)  {
        a.eat();
        if (a instanceof Cat)  {
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) {
            Dog c = (Dog)a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void name();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat Eats");
    }
    public void work() {
        System.out.println("Cat Do");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog Eats");
    }
    public void work() {
        System.out.println("Dog Do");
    }
}
class Animal {
    String name;
    public void eat() {
        System.out.println("I eat a lot");
    }
}
class Cat extends Animal {
    // new method in subclass
    public void display() {
        System.out.println("I'm a cat. My name is " + name);
    }
}

class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Mimi";
        cat.display();
        cat.eat();
    }
}

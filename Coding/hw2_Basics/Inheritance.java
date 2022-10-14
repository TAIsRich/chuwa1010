// reference: https://www.runoob.com/java/java-inheritance.html

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void getName() {
        System.out.println(name);
    }
    public void getid() {
        System.out.println(id);
    }
}

public class Dog extends Animal {
    public Dog(String myName, int myid) {
        super(myName, myid);
    }
}

public class Cat extends Animal {
    public Cat(String myName, int myid) {
        super(myName, myid);
    }
}
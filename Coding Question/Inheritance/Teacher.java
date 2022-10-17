package Inheritance;

public class Teacher extends Person {
    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a teacher.");
    }
}

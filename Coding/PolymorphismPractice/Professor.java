package PolymorphismPractice;
public class Professor {
    private int id;
    private String firstName;
    private String lastName;

    public Professor(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void giveInstruction() {
        System.out.println("Professor" + lastName + "is available for the class");
    }

    public void giveInstruction(String lesson) {
        System.out.println("Professor" + lastName + "can give the instruction on " + lesson);
    }
}
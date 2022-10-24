package EncapsulationPractice;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String major;

    public Student(){

    }

    public Student(int id, String lastName, String firstName, String major) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
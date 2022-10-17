package org.example.oop_01_encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo();
        student1.setName("Juanjuan Xia");
        student1.setEmail("jxiacode@gmail.com");
        System.out.println("Name: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
    }
}

class StudentInfo {
    private String name;
    private String email;

    public StudentInfo() {
    }

    public StudentInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
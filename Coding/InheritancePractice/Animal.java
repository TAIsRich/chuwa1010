package InheritancePractice;

public class Animal {
    private String breed;
    private String sex;

    public void eat() {
        System.out.println("the animal eat lots of foods");
    }

    public void run() {
        System.out.println("the animal can run");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
//Encapsulation: score is encapsulated and private modifier.
public class Game{
    private int score;
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        if(score <0 || score > 100){
            System.out.println("Score Error");
            return;
        }
        this.score= score;
    }
}

//Inheritance and Polymorphism
public class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello, I am" + this.name);
    }
}
// name, and greet() inherits from Animal, greet() method is also polymorphism.
public class Dog extends Animal{
    public Dog(String name) {
        super(name); //name is from Animal class
    }
    public void greet(){
        print("Wangwang, I am" + this.name);
    }
}

//Extra code example for abstract class and interface
//Abstract class
public abstract class Person(){
    public abstract void greet();
    public void sleep() {
        System.out.println("Zzz");
    }
}
// need to implement the abstract method greet in Person()
public class Teenager extends Person{
    public static  void main(String[] args) {
        Teenager teenager = new Teenager();
        teenager.greet();
        teenager.sleep();
    }
    public void greet(){
        System.out.println("I am a teenager.");
    }
}

//interface: it is abstract class, only includes abstract methods. The methods are not implemented here.
interface Student{
    public void goToSchool();
    public void takeExam();
}
//implement the methods above in a class
public class Person implements Student{
    public void goToSchool(){
        System.out.println("I'm going to school.");
    }
    public void takeExam(){
        System.out.println("I'm taking an exam.");
    }
}




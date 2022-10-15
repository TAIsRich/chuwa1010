
public class Person {
	// Encapsulation: have no direct access to some field in the class
  private String name; 
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void run(){
  	System.out.println("This Person is running");
  }
}


// Inheritance: Logically Student is a Person, so Student can inherited something from Person 
public class Student extends Person{
	// in this case, no need to redefine some fields and methods like name and age
	 private int score;

	public int getScore() {
    return score;
  }

  public void setSocre(int newScore) {
    this.age = newScore;
  }

  // Polymorphism: By Inheritance from Person Class, we can use a single method in different ways
  @Override
  public void run(){
  	System.out.println("This Student is running");
  }
}













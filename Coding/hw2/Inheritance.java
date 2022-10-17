public class Inheritance {
}
class Person{
    private Date born_time;
    private String gender;

    Person(Date age, String gender){
        this.born_time=age;
        this.gender=gender;
    }
}
class Student extends Person{
    private int grade;
    Student(Date day, String gender,int grade){
        super(day,gender);
        this.grade=grade;
    }

}
class Employee extends Person{
    private String employer;
    Employee(Date day, String gender,String employer){
        super(day,gender);
        this.employer=employer;

    }


}
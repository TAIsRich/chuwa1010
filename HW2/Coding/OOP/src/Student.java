public class Student extends People{
    public Student(int age, String name) {
        super(age, name);
    }



    @Override
    public void sayHi() {
//        super.sayHi();
        System.out.println("Hi Student");
    }
}

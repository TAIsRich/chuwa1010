public class Staff extends People{
    public Staff(int age, String name) {
        super(age, name);
    }

    @Override
    public void sayHi() {
//        super.sayHi();
        System.out.println("Hi Staff");
    }
}

package org.example;

public class Q1 {
    public static void main(String[] args) {

        //encapsulation
        System.out.println("Encapsulation:");
        Student a = new Student();
        a.setName("A");
        a.setIndex(1);
        System.out.println(a.getIndex());
        System.out.println(a.getName());

        //polymorphism
        System.out.println("Polymorphism:");
        Shape s = new Shape();
        System.out.println("The parameter is " + s.getPerimeter());
        Circle c = new Circle(3);
        System.out.println("The parameter of circle is " + c.getPerimeter());

        //Inheritance
        System.out.println("Inheritance:");
        Rectangle r = new Rectangle(3, 4);
        System.out.println("The parameter of rectangle is " + r.getPerimeter());
        System.out.println("The area is " + r.getArea());

    }
}

    class Student{
        //encapsulation
        private String name;
        private int index;

        public Student(){

        }

        public Student(String name, int index){
            this.name = name;
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public int getIndex(){
            return index;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setIndex(int index){
            this.index = index;
        }

    }



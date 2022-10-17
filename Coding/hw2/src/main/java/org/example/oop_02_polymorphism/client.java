package org.example.oop_02_polymorphism;

public class client {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(1, 3, 3);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(2, 4);
        System.out.println("Perimeter of the Triangle: " + shapes[0].getPerimeter());
        System.out.println("Perimeter of the Square: " + shapes[1].getPerimeter());
        System.out.println("Perimeter of the Rectangle: " + shapes[2].getPerimeter());
    }
}

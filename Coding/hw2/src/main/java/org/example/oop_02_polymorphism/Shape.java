package org.example.oop_02_polymorphism;

public class Shape {
    public double getPerimeter() {
        return 0;
    }
}

class Triangle extends Shape {
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(double sideLength1, double sideLength2, double sideLength3) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    public double getPerimeter() {
        return sideLength1 + sideLength2 + sideLength3;
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
}

class Rectangle extends Shape {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public double getPerimeter() {
        return sideLength1 + sideLength2;
    }
}
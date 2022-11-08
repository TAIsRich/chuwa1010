package Polymorphism;

public class Shape {
    public double getLength() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getLength() {
        return 2 * (this.height + this.width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getLength() {
        return 2 * 3.14 * this.radius;
    }
}
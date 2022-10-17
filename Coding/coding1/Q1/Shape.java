package org.example;

public class Shape {
    public double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape {

    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getPerimeter(){
        double v = 3.14 * 2 * r;
        return v;
    }
}

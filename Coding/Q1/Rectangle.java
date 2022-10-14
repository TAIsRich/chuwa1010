package org.example;

public class Rectangle extends Shape {
    //Inheritance
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        return length + width;
    }

    public double getArea(){
        return length * width;
    }
}

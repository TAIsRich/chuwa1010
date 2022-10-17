public class Polymorphism {
public static void main(String[] args){
    Shape s = new Rectangle(2,3);
    System.out.println(s.printArea());
    s= new Triangle(2,3);
    System.out.println(s.printArea());
    s= new Circle(2);
    System.out.println(s.printArea());
}
}
abstract class Shape{
    protected double high;
    protected double width;
    public Shape(double h,double w) {
        this.high=h;
        this.width=w;
    }
    public abstract double printArea();
}
class Rectangle extends Shape{
    public Rectangle(double h,double w) {
        super(h,w);
    }
    public double printArea() {
        return super.high*super.width;
    }
}
class Triangle extends Shape{
    public Triangle(double h,double w) {
        super(h,w);
    }
    public double printArea() {
        return super.high*super.width/2;
    }
}

class Circle extends Shape{
    public Circle(double r) {
        super(r,r);
    }
    public double printArea() {
        return super.high*super.high*Math.PI;
    }
}


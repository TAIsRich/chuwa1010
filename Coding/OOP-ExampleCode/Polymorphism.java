class Vehicle {
    public void display() {
        System.out.println("Vehicle");
    }
}
//overriding
class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("It is a Car");
    }
}
//overloading
class Bus extends Vehicle {
    public void display(int num) {
        System.out.println("It is Bus # " + num);
    }
}
class Main {
    public static void main(String[] args) {

        // create an object of Java class
        Car car1 = new Car();
        car1.display();

        Bus bus1 = new Bus();
        bus1.display(1);
    }
}

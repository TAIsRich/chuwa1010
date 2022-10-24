package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the parking lot");
        System.out.println("It could park 3 cars.");

        ParkingSpace ps = new ParkingSpace();
        Car a = new Car(1, "A");
        Van b = new Van(2, "Van");
        Car c = new Car(3, "C");
        Car d = new Car(4, "D");
        ps.addCar(a.getCarNumber(),a.getCarType());
        ps.addCar(b.getCarNumber(),b.getCarType());
        ps.addCar(c.getCarNumber(),c.getCarType());
        ps.addCar(d.getCarNumber(),d.getCarType());
    }


}

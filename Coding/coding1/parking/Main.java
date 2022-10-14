package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the parking lot.");
        System.out.println("There are 5 parking spots");
        ParkingSpace park = new ParkingSpace();

        Car a = new Car(1,1,"sedan");
        Car b = new Car(2,1,"sedan");
        Car c = new Car(3,2,"bus");
        Car d = new Car(4,2,"SUV");
        park.parkCar(a.getCarId(),a.getCarSize(),a.getCarType());
        park.parkCar(b.getCarId(),b.getCarSize(),b.getCarType());
        park.parkCar(c.getCarId(),c.getCarSize(),c.getCarType());
        park.parkCar(d.getCarId(),d.getCarSize(),d.getCarType());
    }
}
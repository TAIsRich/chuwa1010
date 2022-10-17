package org.example;

public class Main {
    public static void main(String[] args) {

        //creating an object of the class ParkingLot
        ParkingLot pl= new ParkingLot(2);

        Car car1= new Car("1212", "Amazon");
        Motorcycle m1= new Motorcycle("3344", "Amazon");
        Car car2= new Car("3454", "LinkedIn");
        Motorcycle m2= new Motorcycle("5657", "LinkedIn");

        Car car3= new Car("9080", "Amazon");

        //parking the vehicles
        pl.parkVehicle(car1);
        pl.parkVehicle(m1);
        pl.parkVehicle(car2);

        //for displaying the list of vehicles that has company name Amazon
        pl.CompanyParked("Amazon");
        pl.CompanyParked("LinkedIn");

        pl.leave(m1,0);
        pl.CompanyParked("Amazon");

        pl.parkVehicle(m2);
        pl.parkVehicle(car3);
    }
}
// code resources: https://www.javatpoint.com/parking-lot-design-java
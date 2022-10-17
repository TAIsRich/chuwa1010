package org.example;

public class ParkingSpace {
    private int capacity;
    private int carId;
    private int carSize;
    private String carType;

    public ParkingSpace(){
        capacity = 5;
    }

    public void parkCar(int carId, int carSize, String carType){
        if (capacity > carSize){
            this.carId = carId;
            this.carSize = carSize;
            this.carType = carType;
            capacity -= this.carSize;
            System.out.println(carId +" " + carType + " is Parked successfully!!");
        } else {
            System.out.println("No more parking space!!");
        }
    }
}

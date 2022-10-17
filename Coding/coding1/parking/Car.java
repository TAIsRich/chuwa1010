package org.example;

public class Car {
    private int carId;
    private int carSize;
    private String carType;
    public Car (int carId, int carSize, String carType){
        this.carId = carId;
        this.carSize = carSize;
        this.carType = carType;
    }

    public Car(){

    }

    public int getCarId(){
        return carId;
    }

    public int getCarSize(){
        return carSize;
    }

    public String getCarType(){
        return carType;
    }
}

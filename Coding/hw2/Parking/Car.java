package org.example;

public class Car {
    private int carNumber;
    private String carType;

    public Car(int carNumber, String carType){
        this.carNumber = carNumber;
        this.carType = carType;
    }

    public Car() {
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getCarType(){
        return carType;
    }
}


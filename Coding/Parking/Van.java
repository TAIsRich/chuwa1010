package org.example;

public class Van extends Car {
    private int carNumber;
    private String carType;

    public Van(int carNumber, String carType) {
        this.carNumber = carNumber;
        this.carType = carType;
    }

    public void voice(){
        System.out.println("This is a van.");
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getCarType(){
        voice();
        return carType;
    }

}

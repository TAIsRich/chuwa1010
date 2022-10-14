package org.example;

public class ParkingSpace {
    private int capacity;
    private int carNumber;
    private String carType;
    //rivate boolean state = true;

    public ParkingSpace(){
      capacity = 3;

    }

    public void addCar(int carNumber,String carType){
        if(capacity > 0) {
            this.carNumber = carNumber;
            this.carType = carType;
            //System.out.println(capacity);
            capacity--;
            System.out.println(carType + " "+ carNumber + " is parked successfully");
        } else {
            System.out.println("No parking space.");
        }
    }


}

public class Main {
    public static void main(String[] args){
        //by default, it is a 2 levels parking lot with 2 spots each level
        ParkingLot lot = new ParkingLot(2);

        //car #1 with license plate AA1357 going to park in the lot
        Car car1 = new Car("AA1357");
        lot.parkVehicle(car1);

        //car #2 with license plate AB9873 going to park in the lot
        Car car2 = new Car("AB9873");
        lot.parkVehicle(car2);

        // motorcycle #1 with license plate M133 going to park in the lot
        Motorcycle motor1 = new Motorcycle("M133");
        lot.parkVehicle(motor1);

        //car #3 with license plate AD2382 going to park in the lot
        Car car3 = new Car("AD2382");
        lot.parkVehicle(car3);

        //car #4 with license plate BE1676 going to park in the lot
        //LOT IS FULL
        Car car4 = new Car("BE1676");
        lot.parkVehicle(car4);

        //car #3 leaves the parking lot
        lot.leave(car3,1);

        //car #4 parked in the lot successfully
        lot.parkVehicle(car4);


    }
}

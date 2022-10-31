public class Main {
    public  static void main(String argvs[]){
        // create an object of the class ParkingLot
        ParkingLot parkingLot = new ParkingLot(4);

        // create vehicle
        Compact car1 = new Compact("BOBA");

        Motorcycle car2 = new Motorcycle("little-motor");

        Large car3 = new Large("big-car");

        Compact car4 = new Compact("GUA-car");

        Compact car5 = new Compact("medium-car");

        // park the vehicles
        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(car3);

        parkingLot.leave(car3,1);

        parkingLot.parkVehicle(car4);
        parkingLot.parkVehicle(car5);
    }
}

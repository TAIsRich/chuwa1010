public class ParkingLotSystem {
    private ParkingLot park;
    ParkingLotSystem(){
        park=new ParkingLot();
    }
    ParkingLotSystem(int trucks,int coupes,int electric){
        park= new ParkingLot(trucks,coupes,electric);
    }
    public boolean parkCar(Car car){
        int carsParked;
        if(car.getName()=="Truck"){
            carsParked=park.getTrucks();
            if(carsParked==0){
                return false;
            }
            park.setTrucks(carsParked-1);
        } else if (car.getName()=="Coupe") {
            carsParked=park.getCoupe();
            if(carsParked==0){
                return false;
            }
            park.setCoupe(carsParked-1);
        }else {
            carsParked=park.getElectric();
            if(carsParked==0){
                return false;
            }
            park.setElectric(carsParked-1);
        }
        return true
    }
    public void CarLeave(Car car){
        int carsParked;
        if(car.getName()=="Truck"){
            park.setTrucks(carsParked+1);
        } else if (car.getName()=="Coupe") {
            park.setCoupe(carsParked+1);
        }else {
            park.setElectric(carsParked+1);
        }
    }
}
class Car{
    private String name;
    Car(String name){
        this.name=name;
    }
    Car(){
        this.name="Coupe";
    }

    public String getName() {
        return name;
    }
}
class Truck{
    Truck(){
        super("Truck");
    }
}
class Coupe{
    Coupe(){
        super("Coupe");
    }

}
class ElectricCar{
    ElectricCar(){
        super("Electric Car");
    }

}
class ParkingLot{
    private int trucks;
    private int coupe;
    private int electric;
    ParkingLot(){
        this.trucks=0;
        this.coupe=0;
        this.electric=0;
    }
    ParkingLot(int t,int c,int e){
        this.trucks=t;
        this.coupe=c;
        this.electric=e;
    }

    public int getCoupe() {
        return coupe;
    }

    public int getElectric() {
        return electric;
    }

    public int getTrucks() {
        return trucks;
    }

    public void setCoupe(int coupe) {
        this.coupe = coupe;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }

    public void setTrucks(int trucks) {
        this.trucks = trucks;
    }
}
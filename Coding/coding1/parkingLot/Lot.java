import java.util.ArrayList;

public class Lot {
    private String address;
    private String company;
    private Employee manager;
    private Employee security;
    private ArrayList<Space> availableSpaces = new ArrayList<>();
    private ArrayList<Space> occupiedSpaces = new ArrayList<>();

    public Lot(){}

    public Lot(String address, String company, int nSpaces){
        this.address = address;
        this.company = company;
        for(int i=1; i<nSpaces+1; i++){
            availableSpaces.add(new Space(i));
        }
    }

    //TODO: write getters

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setSecurity(Employee security){
        this.security = security;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void parkVehicle(Vehicle vehicle){
        if(availableSpaces.size()>0){
            Space space = availableSpaces.get(0);
            space.park(vehicle);
            occupiedSpaces.add(space);
            availableSpaces.remove(0);
        }else{
            System.out.println("No available space");
        }
    }

    public void removeVehicle(){
        if(occupiedSpaces.size()>0){
            Space space = occupiedSpaces.get(0);
            double charge = space.checkout();
            System.out.println("The parking charge is "+charge);
            availableSpaces.add(space);
            occupiedSpaces.remove(0);
        }else{
            System.out.println("No car to be removed");
        }
    }

    public void printAvailability(){
        System.out.println("This parking lot currently have "+availableSpaces.size()+" available spaces");
    }
}

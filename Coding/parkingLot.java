
class Vehicle {
    private int plateNumber;
    private String model;
    private String type;

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

}

class ParkingSpot {
    private int number;
    private boolean isEmpty;
    private String category;

    public int getNumber() {
        return number;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }
    public String getCategory() {
        return category;
    }
}
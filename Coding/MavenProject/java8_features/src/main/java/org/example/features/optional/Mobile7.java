package org.example.features.optional;

public class Mobile7 {
    private long id;
    private String brand;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisplayFeatures7 getDisplayFeatures() {
        return displayFeatures;
    }

    public void setDisplayFeatures(DisplayFeatures7 displayFeatures) {
        this.displayFeatures = displayFeatures;
    }

    private DisplayFeatures7 displayFeatures;

}

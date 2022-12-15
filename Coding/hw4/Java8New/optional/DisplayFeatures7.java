package org.example.Optional;

import java.util.Optional;

public class DisplayFeatures7 {
    private String size;
    private ScreenResolution resolution;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ScreenResolution getResolution() {
        return resolution;
    }

    public void setResolution(Optional<ScreenResolution> ro) {
        this.resolution = resolution;
    }
}

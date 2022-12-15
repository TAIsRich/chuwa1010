package org.example.Optional;

import java.util.Optional;

public class DisplayFeatures {
    private String size;
    private Optional<ScreenResolution> ro;

    public  DisplayFeatures(String size, Optional<ScreenResolution> ro){
        this.size = size;
        this.ro = ro;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Optional<ScreenResolution> getRo() {
        return ro;
    }

    public void setRo(Optional<ScreenResolution> ro) {
        this.ro = ro;
    }


}

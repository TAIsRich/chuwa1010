package org.example.Optional;

import java.util.Optional;

public class Client {

    public int getMobileScreenWidth(Mobile7 m7){
        if(m7 != null){
            DisplayFeatures7 df = m7.getDisplayFeatures();
            if(df != null){
                ScreenResolution sr = df.getResolution();
                if(sr != null){
                    return sr.getWidth();
                }
            }
        }
        return 0;
    }

    public int getMobileScreenWidthOptional(Mobile m){
        return Optional.ofNullable(m).flatMap(Mobile::getDisplayFeaturesOptional)
                .flatMap(DisplayFeatures::getRo)
                .map(ScreenResolution::getWidth)
                .orElse(0);

    }
}

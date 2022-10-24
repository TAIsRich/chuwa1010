package hw4.Q2.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {
    public int getMobileScreenWidthOptional(Mobile mobile) {
        return Optional.ofNullable(mobile).flatMap(Mobile::getDisplayFeaturesOptional)
                .flatMap(DisplayFeatures::getResolutionOptional)
                .map(ScreenResolution::getWidth)
                .orElse(0);
    }
}

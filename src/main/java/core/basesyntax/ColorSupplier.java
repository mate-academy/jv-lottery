package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random getColour;
    public ColorSupplier() {
        getColour = new Random();
    }
    public String getRandomColor() {
        return AvailableColour.values()[getColour.nextInt(AvailableColour.values().length)]
            .name();
    }
}
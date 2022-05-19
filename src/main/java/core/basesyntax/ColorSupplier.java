package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random getColour = new Random();
        return AvailableColours.values()[getColour.nextInt(AvailableColours.values().length)]
            .toString();
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random getColour;

    public ColorSupplier(Random random) {
        getColour = random;
    }

    public String getRandomColor() {
        return AvailableColour.values()[getColour.nextInt(AvailableColour.values().length)]
            .name();
    }
}

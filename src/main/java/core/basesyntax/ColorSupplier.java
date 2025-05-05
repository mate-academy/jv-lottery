package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return AvailableColour.values()[random.nextInt(AvailableColour.values().length)]
            .name();
    }
}

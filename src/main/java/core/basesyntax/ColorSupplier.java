package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random;

    public ColorSupplier(Random random) {
        ColorSupplier.random = random;
    }

    public String getRandomColor() {
        int indexEnum = random.nextInt(Colors.values().length);
        return (Colors.values()[indexEnum]).name();
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int indexEnum = random.nextInt(Color.values().length);
        return (Color.values()[indexEnum]).name();
    }
}

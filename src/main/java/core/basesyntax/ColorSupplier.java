package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(final Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        int indexRandom = random.nextInt(Color.values().length);
        return Color.values()[indexRandom];
    }
}

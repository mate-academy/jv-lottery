package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static int MAX_VALUE = Color.values().length;
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {

        int index = random.nextInt(MAX_VALUE);
        return Color.values()[index];
    }
}

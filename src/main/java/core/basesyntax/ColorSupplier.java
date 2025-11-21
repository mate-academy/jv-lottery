package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        Color[] values = Color.values();
        int index = random.nextInt(values.length);
        return values[index];
    }
}

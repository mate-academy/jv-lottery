package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        Color[] values = Color.values();
        int size = values.length;
        return String.valueOf(values[random.nextInt(size)]);
    }
}

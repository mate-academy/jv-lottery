package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] values = Color.values();
        int size = values.length;
        return values[random.nextInt(size)].name();
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] values = Colors.values();

    public Colors getRandomColor() {
        return values[random.nextInt(values.length)];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int idx = random.nextInt(values.length);
        return values[idx].name();
    }
}

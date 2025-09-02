package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();
        Colors[] values = Colors.values();
        return values[random.nextInt(values.length)];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        return values[new Random().nextInt(values.length)];
    }
}

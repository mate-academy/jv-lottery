package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        int rand = new Random().nextInt(values.length);

        return values[rand];
    }
}


package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] values = Colors.values();
        return values[new Random().nextInt(values.length)].toString();
    }
}

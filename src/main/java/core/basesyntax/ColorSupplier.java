package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] values = Colors.values();
        Random random = null;
        int idx = random.nextInt(values.length);
        return values[idx].name();
    }
}

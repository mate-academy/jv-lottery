package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] values = Color.values();

    public String getRandomColor() {
        return values[random.nextInt(values.length)].name();
    }
}

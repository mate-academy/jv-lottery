package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final int COLOR_COUNT = Colors.values().length;
    public Colors getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        return Colors.values()[index];
    }
}

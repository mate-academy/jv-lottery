package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        return "" + Colors.values()[colorNumber];
    }
}

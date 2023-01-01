package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(COLOR_COUNT)];
    }
}

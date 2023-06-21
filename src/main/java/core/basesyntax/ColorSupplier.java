package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int BOUND = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(BOUND)];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int color = random.nextInt(COLORS_COUNT);
        return Color.values()[color];
    }

}

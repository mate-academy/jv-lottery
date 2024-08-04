package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static final Random RANDOM = new Random();

    public Color getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}

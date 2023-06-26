package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random RANDOM = new Random();
    private final Color[] COLORS = Color.values();

    public Color getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        int indexOfRandom = random.nextInt(COLORS.length);
        return COLORS[indexOfRandom];
    }
}

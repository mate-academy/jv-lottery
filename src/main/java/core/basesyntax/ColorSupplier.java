package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] ALL_COLORS;
    private final Random RANDOM;

    public ColorSupplier() {
        this.ALL_COLORS = Color.values();
        this.RANDOM = new Random();
    }

    public Color getRandomColor() {
        int index = RANDOM.nextInt(ALL_COLORS.length);
        return ALL_COLORS[index];
    }
}
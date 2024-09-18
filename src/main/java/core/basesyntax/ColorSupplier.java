package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLOR_VALUES = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_VALUES.length);
        return COLOR_VALUES[index];
    }
}

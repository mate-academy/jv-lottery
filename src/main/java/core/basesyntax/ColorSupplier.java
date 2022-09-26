package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final int size = colors.length;

    public Color getRandomColor(final Random randomizer) {
        return colors[randomizer.nextInt(size)];
    }
}

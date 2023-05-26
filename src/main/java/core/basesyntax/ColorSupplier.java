package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor(final Random randomizer) {
        Color[] colors = Color.values();
        int size = colors.length;
        return colors[randomizer.nextInt(size)];
    }
}

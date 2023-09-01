package core.basesyntax;

import core.basesyntax.models.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 8;

    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(COLOR_COUNT)];
    }
}

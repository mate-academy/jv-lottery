package core.basesyntax;

import core.basesyntax.models.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 8;
    private Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(COLOR_COUNT)];
    }
}

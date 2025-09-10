package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        final Random random = new Random();
        final int ColorsCount = Color.values().length;
        return Color.values()[random.nextInt(ColorsCount)];
    }
}

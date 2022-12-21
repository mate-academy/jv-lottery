package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final int COLOR_COUNT = 7;
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        return Color.values()[colorNumber];
    }
}


package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 6;
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        return Color.values()[index];
    }
}

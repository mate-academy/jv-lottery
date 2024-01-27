package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Colors.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(COLORS_COUNT);
        Colors color = Colors.values()[colorIndex];
        return color.name();
    }
}

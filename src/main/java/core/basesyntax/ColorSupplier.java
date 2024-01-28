package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(COLORS_COUNT);
        Color color = Color.values()[colorIndex];
        return color.name();
    }
}

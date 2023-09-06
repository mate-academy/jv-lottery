package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorsCount = Color.values().length;
    private final Random random = new Random();
    public Color getRandomColor() {
        int colorIndex = random.nextInt(colorsCount);
        return Color.values()[colorIndex];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int maxColorLength = Color.values().length;
    private final Random randomColors = new Random();

    public Color getRandomColor() {
        int index = randomColors.nextInt(maxColorLength);
        return Color.values()[index];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_AMOUNT = 101;
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public int getRandomNumber() {
        return random.nextInt(ColorSupplier.NUMBER_AMOUNT);
    }

    public Random getRandom() {
        return random;
    }
}

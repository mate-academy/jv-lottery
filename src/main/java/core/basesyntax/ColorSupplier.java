package core.basesyntax;

import java.util.Random;

public enum ColorSupplier {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE;

    private static final Random RANDOM = new Random();
    public static ColorSupplier getRandomColor() {
        return values()[RANDOM.nextInt(values().length)];
    }
}

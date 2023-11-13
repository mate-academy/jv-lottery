package core.basesyntax;

import java.util.Random;

public enum ColorSupplier {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE;

    public static ColorSupplier getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

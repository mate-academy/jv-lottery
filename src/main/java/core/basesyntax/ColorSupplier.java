package core.basesyntax;

import java.util.Random;

public enum ColorSupplier {
    RED,
    GREEN,
    YELLOW,
    PURPLE,
    BROWN,
    BLUE,
    GRAY,
    ORANGE;

    private static final Random RANDOM = new Random();

    public static String getRandomColor() {
        ColorSupplier[] colorSupplier = values();
        return colorSupplier[RANDOM.nextInt(colorSupplier.length)].toString();      
    }
}

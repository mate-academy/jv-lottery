package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private static final Random RANDOM = new Random();

    public static String getRandomColor() {
        return String.valueOf(COLORS[RANDOM.nextInt(Colors.values().length)]);
    }
}

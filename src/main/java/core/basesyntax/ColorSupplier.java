package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private static final Random RANDOM = new Random();

    public static Colors getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public static Colors getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[RANDOM.nextInt(colors.length)];
    }
}

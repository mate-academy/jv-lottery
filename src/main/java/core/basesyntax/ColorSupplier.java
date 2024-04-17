package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static Random getRandom() {
        return random;
    }

    public Colors getRandomColor() {
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];
        return color;
    }
}
[]
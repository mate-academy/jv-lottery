package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random PRNG = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[PRNG.nextInt(colors.length)].toString();
    }
}

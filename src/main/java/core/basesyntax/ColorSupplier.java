package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length);
        Colors str = Colors.values()[colorIndex];
        return str.name();
    }
}

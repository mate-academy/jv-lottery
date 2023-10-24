package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLOR = Color.values();
    private static final Random RANDOM = new Random();

    ColorSupplier() {}

    public static Color getRandomColor() {
        return COLOR[RANDOM.nextInt(COLOR.length)];
    }
}

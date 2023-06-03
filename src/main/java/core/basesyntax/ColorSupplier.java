package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static final Random random = new Random();

    public static Color getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}

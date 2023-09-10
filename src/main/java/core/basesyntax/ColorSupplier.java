package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] ALL_COLORS = Color.values();
    private static final Random RANDOM = new Random();

    public static Color getRandomColor() {
        int index = RANDOM.nextInt(ALL_COLORS.length);
        return ALL_COLORS[index];
    }
}

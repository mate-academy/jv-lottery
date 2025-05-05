package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final Colors[] COLORS = Colors.values();

    public static Colors getRandomColor() {
        int randomIndex = RANDOM.nextInt(COLORS.length);
        return COLORS[randomIndex];
    }
}

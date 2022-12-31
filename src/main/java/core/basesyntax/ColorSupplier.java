package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random getRandom = new Random();
    private static final Color[] colors = Color.values();

    public static Color getRandomColor() {
        return colors[getRandom.nextInt(colors.length)];
    }
}

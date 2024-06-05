package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Color {
    private static final Random random = new Random();

    public static Colors getRandomColors() {
        Colors[] colors = Colors.values();
        int index = random.nextInt(colors.length);
        return colors[random.nextInt(colors.length)];
    }
}

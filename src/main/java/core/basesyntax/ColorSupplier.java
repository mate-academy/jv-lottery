package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random RANDOM = new Random();

    public static Color getRandomColor() {
        Color[] colors = Color.values();
        int index = RANDOM.nextInt(colors.length);
        return colors[index];
    }
}

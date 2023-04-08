package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random();

    public static Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}

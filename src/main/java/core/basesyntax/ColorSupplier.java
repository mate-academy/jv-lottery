package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();

        return colors[random.nextInt(colors.length)];
    }
}

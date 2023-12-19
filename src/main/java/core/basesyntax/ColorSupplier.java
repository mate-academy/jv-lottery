package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();

        if (colors.length == 0) {
            throw new IllegalStateException("No colors defined in the Color enum");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}

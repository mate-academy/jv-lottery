package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();

        if (colors.length == 0) {
            throw new IllegalStateException("No colors defined in the Color enum");
        }

        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}

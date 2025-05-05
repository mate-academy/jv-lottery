package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        if (colors == null || colors.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}

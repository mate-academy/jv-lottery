package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomColor = random.nextInt(colors.length);
        return colors[randomColor];
    }
}

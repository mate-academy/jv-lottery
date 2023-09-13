package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Color getRandomColor() {
        Color[] color = Color.values();
        return color[random.nextInt(color.length)];
    }
}

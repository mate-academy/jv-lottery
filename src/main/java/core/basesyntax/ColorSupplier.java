package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors;
    private final Random random;

    public ColorSupplier(Color[] colors) {
        this.colors = colors;
        this.random = new Random();
    }

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
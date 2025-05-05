package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors;
    private Random random;

    public ColorSupplier() {
        colors = Color.values();
        random = new Random();
    }

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}

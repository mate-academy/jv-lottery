package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return Color.values()[random.nextInt(colors.length)];
    }
}

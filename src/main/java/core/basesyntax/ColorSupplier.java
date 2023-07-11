package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private static final int figureCount = 8;

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(figureCount);
        return colors[index];
    }
}

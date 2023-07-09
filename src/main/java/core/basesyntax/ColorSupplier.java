package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final int FIGURE_COUNT = 8;

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(FIGURE_COUNT);
        return colors[index];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();

    public int getRmInt() {
        return random.nextInt(FIGURE_COUNT) + 1;
    }

    public String getRandomColor() {
        Color[] values = Color.values();
        int length = values.length;
        int randIndex = random.nextInt(length);
        Color colors = values[randIndex];
        return colors.name();
    }
}

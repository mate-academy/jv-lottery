package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER = 101;
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public int getRandomInt() {
        return random.nextInt(MAX_NUMBER);
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = Color.values();
    private final int maxIndex = colors.length;

    public Color getRandomColor() {
        int index = random.nextInt(maxIndex);
        return colors[index];
    }
}

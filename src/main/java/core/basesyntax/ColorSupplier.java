package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    Color[] colors = Color.values();
    int maxIndex = colors.length;;
    public Color getRandomColor() {
        int index = random.nextInt(maxIndex);
        return colors[index];
    }
}

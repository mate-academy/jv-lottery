package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] allColors = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(allColors.length);
        return allColors[index];
    }
}

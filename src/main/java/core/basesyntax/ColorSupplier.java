package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] allColor;
    private final Random random;

    public ColorSupplier() {
        this.allColor = Color.values();
        this.random = new Random();
    }

    public Color getRandomColor() {
        int index = random.nextInt(allColor.length);
        return allColor[index];
    }
}

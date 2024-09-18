package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final Color[] colorValues = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index];
    }
}

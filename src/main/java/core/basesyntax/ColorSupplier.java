package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Color[] colorValues = Color.values();
    private static Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index];
    }
}

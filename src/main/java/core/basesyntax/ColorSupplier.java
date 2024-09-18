package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    final static Color [] colorValues = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index];
    }
}

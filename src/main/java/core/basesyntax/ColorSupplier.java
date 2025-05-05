package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colorValues = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index].name();
    }
}

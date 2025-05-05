package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colorValues = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(colorValues.length);
        return colorValues[index].name();
    }
}

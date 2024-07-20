package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random random = new Random();

    public String getRandomColor() {
        Color[] colorValues = Color.values();
        int randomIndex = random.nextInt(colorValues.length);

        return colorValues[randomIndex].name();

    }
}

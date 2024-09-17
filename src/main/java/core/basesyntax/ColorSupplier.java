package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] colorsList = Color.values();

    public Color getRandomColor() {
        return colorsList[random.nextInt(colorsList.length)];
    }
}

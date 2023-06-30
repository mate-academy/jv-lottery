package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int numberOfColors = Color.values().length;
        int index = random.nextInt(numberOfColors);
        return Color.values()[index];
    }
}

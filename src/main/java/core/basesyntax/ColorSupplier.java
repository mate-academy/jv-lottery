package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int colorsLength = Color.values().length;
        int index = random.nextInt(colorsLength);
        return Color.values()[index];
    }
}

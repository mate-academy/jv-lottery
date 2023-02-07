package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM_COLOR = new Random();

    public Color getRandomColor() {
        int index = RANDOM_COLOR.nextInt(Color.values().length);
        return Color.values()[index];
    }
}

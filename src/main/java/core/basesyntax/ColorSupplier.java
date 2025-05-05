package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public Color getRandomColor() {
        int index = RANDOM.nextInt(Color.values().length);
        return Color.values()[index];
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[getRandom().nextInt(Color.values().length)];
    }

    public Random getRandom() {
        return random;
    }
}


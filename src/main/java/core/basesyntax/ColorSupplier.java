package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[getRandom().nextInt(Color.values().length)].toString();
    }

    public Random getRandom() {
        return random;
    }
}

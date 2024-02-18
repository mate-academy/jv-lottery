package core.basesyntax;

import enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length);
        return Color.values()[colorIndex].toString();
    }
}

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public String getRandomColor() {
        int colorIndex = randomizer.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}

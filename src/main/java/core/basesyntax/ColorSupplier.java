package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomIndexGenerator = new Random();

    public Color getRandomColor() {
        int enumColorIndex = randomIndexGenerator.nextInt(Color.values().length);
        return Color.values()[enumColorIndex];
    }
}

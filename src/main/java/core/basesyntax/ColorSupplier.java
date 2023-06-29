package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomIndexGenerator = new Random();

    public Colors getRandomColor() {
        int enumColorIndex = randomIndexGenerator.nextInt(Colors.values().length);
        return Colors.values()[enumColorIndex];
    }
}

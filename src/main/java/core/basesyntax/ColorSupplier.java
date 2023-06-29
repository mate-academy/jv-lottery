package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomGenerator = new Random();

    public Colors getRandomColor() {
        int index = randomGenerator.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}

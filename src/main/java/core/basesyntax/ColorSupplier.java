package core.basesyntax;

import java.util.Random;

/**
 * Supplies random Colors.
 */
public class ColorSupplier {
    private final Random random = new Random();

    /**
     * Returns a random Colors value chosen from the enum.
     *
     * @return a random Colors value
     */
    public Colors getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)];
    }
}

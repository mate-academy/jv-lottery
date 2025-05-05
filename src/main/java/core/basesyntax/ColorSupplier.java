package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colors getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)];
    }

    public Random getRandom() {
        return random;
    }
}

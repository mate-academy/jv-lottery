package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public Ball.Colors getRandomColor() {
        return Ball.Colors.values()[random.nextInt(Ball.Colors.values().length)];
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(getColorSupplier().getRandomColor(), getRandom().nextInt(MAX_NUMBER));
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Random getRandom() {
        return random;
    }
}

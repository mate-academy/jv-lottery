package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_RANGE_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(RANDOM_RANGE_LIMIT));
    }
}

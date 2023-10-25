package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_LIMIT));
    }
}

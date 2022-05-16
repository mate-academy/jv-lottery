package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BALLS = 100;
    private final ColorSupplier supplier;
    private final Random random;

    public Lottery() {
        supplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_BALLS));
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BALLS = 100;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_RANDOM_BALLS));
    }
}

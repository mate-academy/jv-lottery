package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int LIMIT = 100;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        int value = random.nextInt(LIMIT);
        return new Ball(value, supplier.getRandomColor());
    }
}


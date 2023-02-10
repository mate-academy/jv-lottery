package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        int limit = 100;
        int value = random.nextInt(limit);
        return new Ball(value, supplier.getRandomColor());
    }
}


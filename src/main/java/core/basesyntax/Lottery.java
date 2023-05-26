package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxValue = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(maxValue));
    }
}

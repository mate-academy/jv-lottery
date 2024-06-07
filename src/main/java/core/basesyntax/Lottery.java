package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_CEIL = 101;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(RANDOM_CEIL));
    }
}

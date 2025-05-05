package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_VALUE);
        return new Ball(supplier.getRandomColor(), value);
    }
}

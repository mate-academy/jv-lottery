package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int value = 100;
    private final Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(value));
    }
}

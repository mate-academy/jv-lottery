package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNDS = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random number = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), number.nextInt(NUMBER_BOUNDS));
    }
}

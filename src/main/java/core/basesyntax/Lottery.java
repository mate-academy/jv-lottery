package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAXIMUM_POSSIBLE_NUMBER);
        return new Ball(supplier.getRandomColor(), number);
    }
}

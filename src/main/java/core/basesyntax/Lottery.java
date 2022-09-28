package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int number = random.nextInt(MAXIMUM_POSSIBLE_NUMBER);
        return new Ball(supplier.getRandomColor(), number);
    }
}

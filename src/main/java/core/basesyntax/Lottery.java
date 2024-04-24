package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomValue = random.nextInt(RANDOM_NUMBER);
        return new Ball(supplier.getRandomColor(), randomValue);
    }
}

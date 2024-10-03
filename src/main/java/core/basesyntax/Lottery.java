package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    public int getRandomNumber() {
        return random.nextInt(NUMBER_BOUND);
    }
}

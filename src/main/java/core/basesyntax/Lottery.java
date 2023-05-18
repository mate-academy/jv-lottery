package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int RANDOM_CONSTANT = 100;

    public Ball getRandomBall() {
        int value = random.nextInt(RANDOM_CONSTANT);
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}

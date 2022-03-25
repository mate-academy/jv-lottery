package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Integer RANDOM_BOUND = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(RANDOM_BOUND);
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}

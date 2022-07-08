package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor());
    }
}

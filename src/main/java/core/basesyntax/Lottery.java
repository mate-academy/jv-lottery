package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(final Random random, final ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
    }
}

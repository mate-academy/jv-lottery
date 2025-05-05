package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_RANDOM_COUNT = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_RANDOM_COUNT));
    }
}

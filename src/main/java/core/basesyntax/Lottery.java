package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BALL_NUMBER_RANDOM = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_NUMBER_RANDOM));
    }
}

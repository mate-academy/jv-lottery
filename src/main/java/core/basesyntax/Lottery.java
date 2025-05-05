package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_RANDOM = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_NUMBER_RANDOM));
    }
}

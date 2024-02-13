package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_VALUE = 100;
    private static final int MIN_BALL_VALUE = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_BALL_VALUE) + MIN_BALL_VALUE;
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}

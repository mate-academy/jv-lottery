package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(BALL_COUNT));
        return ball;
    }
}

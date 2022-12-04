package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private static final int BALL_NUMBER_LIMIT = 100;
    Ball getRandomBall() {
        Ball ball = new Ball(random.nextInt(BALL_NUMBER_LIMIT), supplier.getRandomColor());
        return ball;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    Ball getRandomBall() {
        Ball ball = new Ball(random.nextInt(BALL_NUMBER_LIMIT), supplier.getRandomColor());
        return ball;
    }
}

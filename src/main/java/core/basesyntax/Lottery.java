package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_RANDOM_NUMBER = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BALL_RANDOM_NUMBER));
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}

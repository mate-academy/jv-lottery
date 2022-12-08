package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();
    private static final int MAX_BALL_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BALL_RANDOM_NUMBER));
        ball.setColor(supplier.getRandomColor().name());
        return ball;
    }
}

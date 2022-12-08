package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_BALL_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(ballNumber);
        ball.setColor(ballColor);
        return ball;
    }
}

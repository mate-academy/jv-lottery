package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_BALL_NUMBER = 101;
    private final Random random = new Random();
    public Lottery() {
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        ball.setColor(getRandomColor());
        return ball;
    }
}

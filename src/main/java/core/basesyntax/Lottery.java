package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int maxBallNumber = 100;
    private final Random random = new Random();
    public Lottery() {
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(maxBallNumber));
        ball.setColor(getRandomColor());
        return ball;
    }
}

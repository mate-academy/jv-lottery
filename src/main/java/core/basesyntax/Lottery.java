package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumberOfBall = random.nextInt(MAX_BALL_NUMBER);
        Ball ball = new Ball(randomNumberOfBall);
        return ball;
    }
}

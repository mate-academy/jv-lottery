package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_BALL_NUMBER_BOUND = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setColor(String.valueOf(ColorSupplier.getRandomColor()));
        ball.setNumber(random.nextInt(RANDOM_BALL_NUMBER_BOUND) + 1);
        return ball;
    }
}

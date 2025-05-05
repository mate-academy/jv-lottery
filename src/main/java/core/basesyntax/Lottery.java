package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(MAX_BALL_NUMBER);
        ball.setNumber(number);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

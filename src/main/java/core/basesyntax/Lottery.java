package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_MAX_VALUE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = random.nextInt(BALL_NUMBER_MAX_VALUE);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}

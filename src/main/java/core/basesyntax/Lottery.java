package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = random.nextInt(BALL_NUMBER_LIMIT);
        ball.setNumber(randomNumber);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_BALL_NUMBER);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}

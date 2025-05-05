package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_BALL_NUMBER = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return ball;
    }
}

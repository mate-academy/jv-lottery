package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER) + 1);

        return ball;
    }
}

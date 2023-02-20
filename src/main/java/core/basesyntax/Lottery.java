package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private static final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(BALL_COUNT));
        ball.setColora(colorSupplier.getRandomColor());
        return ball;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        ball.setColor(colorSupplier.getRandomColor());

        return ball;
    }
}

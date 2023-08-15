package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier randomColour = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColour(randomColour.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return ball;
    }
}

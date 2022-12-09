package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int RANDOM_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(RANDOM_BALL_NUMBER) + 1);
        return ball;
    }
}

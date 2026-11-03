package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxBallNumber = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(maxBallNumber));
        return ball;

    }
}

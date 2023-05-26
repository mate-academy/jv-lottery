package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int NUMBER_BALLS = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(NUMBER_BALLS));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

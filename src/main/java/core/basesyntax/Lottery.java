package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_MAX_BOUNDARY = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_MAX_BOUNDARY) + 1);
        return ball;
    }
}

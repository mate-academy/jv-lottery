package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 101;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_RANDOM));
        return ball;
    }
}

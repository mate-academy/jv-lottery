package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_OF_BOUND = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_OF_BOUND));
        return ball;
    }
}

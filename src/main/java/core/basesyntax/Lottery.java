package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_BOUND));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

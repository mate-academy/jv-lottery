package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BOUND));
        return ball;
    }
}

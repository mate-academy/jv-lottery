package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BOUND));
        return ball;
    }
}

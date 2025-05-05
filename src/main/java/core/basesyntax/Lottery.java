package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return ball;
    }
}

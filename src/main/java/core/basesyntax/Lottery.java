package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;
    private final ColorSupplier supplier;
    private final Random random;

    public Lottery(Random random, ColorSupplier supplier) {
        this.supplier = supplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(BALL_NUMBER) + 1);
        return ball;
    }
}

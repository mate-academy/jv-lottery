package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery() {
        this.random = new Random();
        this.supplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_BALL_NUMBER) + 1);
    }
}

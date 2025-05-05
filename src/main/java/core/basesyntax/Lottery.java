package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 101;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        int figureNumber = random.nextInt(BOUND);
        Ball ball = new Ball(supplier.getRandomColor(), figureNumber);
        return ball;
    }
}

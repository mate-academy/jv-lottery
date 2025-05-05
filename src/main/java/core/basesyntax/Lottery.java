package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int BALL_COUNT = 100;
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery(Random random, ColorSupplier supplier) {
        this.random = random;
        this.supplier = supplier;
    }

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(BALL_COUNT));
        return randomBall;
    }
}

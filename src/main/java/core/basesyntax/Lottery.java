package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;
    private final Ball randomBall = new Ball();
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        randomBall.setNumber(random.nextInt(UPPER_BOUND));
        randomBall.setColor(supplier.getRandomColor());
        return randomBall;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        final int maxValue = 100;
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(maxValue));
        return randomBall;
    }
}

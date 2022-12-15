package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxValue = 100;

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(maxValue));
        return randomBall;
    }

}

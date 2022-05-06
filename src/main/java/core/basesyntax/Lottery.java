package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int UPPER_BOUND = 100;
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(new Random().nextInt(UPPER_BOUND));
        randomBall.setColor(supplier.getRandomColor());
        return randomBall;
    }
}

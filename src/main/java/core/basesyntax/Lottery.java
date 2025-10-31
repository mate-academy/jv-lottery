package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final Ball randomBall = new Ball();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        randomBall.setColor(colorSupplier.getRandomColor().name());
        randomBall.setNumber(random.nextInt(MAX_VALUE));
        return randomBall;
    }
}

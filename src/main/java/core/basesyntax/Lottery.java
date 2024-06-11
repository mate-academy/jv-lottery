package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(NUMBER));
        return randomBall;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_BOUND = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(NUMBERS_BOUND));
        return randomBall;
    }
}

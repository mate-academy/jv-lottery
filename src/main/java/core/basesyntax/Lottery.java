package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int maxNumber = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();

        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(maxNumber) + 1);

        return randomBall;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int intLimit = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball(colorSupplier.getRandomColor(), random.nextInt(intLimit));

        return randomBall;
    }
}

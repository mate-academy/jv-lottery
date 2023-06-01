package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        final int intLimit = 100;
        Colors[] colorsList = new Colors[Colors.values().length];
        Ball randomBall = new Ball(colorSupplier.getRandomColor(), random.nextInt(intLimit));

        return randomBall;
    }
}

package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }
}

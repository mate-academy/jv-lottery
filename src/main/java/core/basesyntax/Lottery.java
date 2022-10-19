package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_VALUE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    protected Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
    }
}


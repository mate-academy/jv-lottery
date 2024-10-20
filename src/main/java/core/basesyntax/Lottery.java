package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
    }
}
